package com.example.products_services.dto;

//public class ProductResponse {
//}
import com.example.products_services.entity.Products;
import lombok.*;

        import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductResponse {

    private UUID id;

    private String name;

    private String description;

    private BigDecimal price;

    private Integer stockQuantity;

    private String brand;

    private String imageUrl;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public ProductResponse(Products product) {
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.createdAt = product.getCreatedAt();
        this.updatedAt = product.getUpdatedAt();
        this.brand = product.getBrand();
        this.price = product.getPrice();
        this.stockQuantity = product.getStockQuantity();
        this.imageUrl = product.getImageUrl();
    }
}