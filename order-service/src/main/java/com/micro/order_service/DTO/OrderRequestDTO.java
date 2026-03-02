package com.micro.order_service.DTO;

import lombok.*;

import java.util.UUID;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequestDTO {
    private UUID userId;
    private UUID productId;

}
