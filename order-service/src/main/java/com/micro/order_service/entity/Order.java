package com.micro.order_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private UUID userId;
    private UUID productId;

    private String userName;
    private String productName;

    private BigDecimal price;

    private LocalDateTime orderDate;

    @PrePersist
    public void onCreate() {
        orderDate = LocalDateTime.now();
    }
}
