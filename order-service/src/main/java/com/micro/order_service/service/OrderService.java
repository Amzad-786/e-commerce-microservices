package com.micro.order_service.service;

import com.micro.order_service.DTO.OrderRequestDTO;
import com.micro.order_service.DTO.OrderResponseDTO;
import com.micro.order_service.DTO.ProductResponse;
import com.micro.order_service.DTO.UserResponseDTO;
import com.micro.order_service.client.ProductClient;
import com.micro.order_service.client.UserClient;
import com.micro.order_service.entity.Order;
import com.micro.order_service.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final UserClient userClient;
    private final ProductClient productClient;
    private final OrderRepository orderRepository;

    public OrderResponseDTO placeOrder(OrderRequestDTO request) {

        // 🔥 Feign Calls
        UserResponseDTO user = userClient.getUser(request.getUserId());
        ProductResponse product = productClient.getProduct(request.getProductId());

        // 🔥 Save Order
        Order order = Order.builder()
                .userId(user.getId())
                .productId(product.getId())
                .userName(user.getName())
                .productName(product.getName())
                .price(product.getPrice())
                .build();

        Order savedOrder = orderRepository.save(order);

        // 🔥 Return Response
        return new OrderResponseDTO(
                savedOrder.getId(),
                savedOrder.getUserName(),
                savedOrder.getProductName(),
                savedOrder.getPrice(),
                savedOrder.getOrderDate()
        );
    }
}
