package com.micro.order_service.DTO;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Setter
@Getter
public class OrderResponseDTO {
    private UUID orderId;
    private String userName;
    private String productName;
    private BigDecimal price;
    private LocalDateTime orderDate;

    public OrderResponseDTO(UUID orderId,
                            String userName,
                            String productName,
                            BigDecimal price,
                            LocalDateTime orderDate) {
        this.orderId = orderId;
        this.userName = userName;
        this.productName = productName;
        this.price = price;
        this.orderDate = orderDate;
    }

}
