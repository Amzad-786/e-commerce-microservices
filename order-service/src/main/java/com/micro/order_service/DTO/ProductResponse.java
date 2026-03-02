package com.micro.order_service.DTO;

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
}