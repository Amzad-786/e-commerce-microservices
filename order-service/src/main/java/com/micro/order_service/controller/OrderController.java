package com.micro.order_service.controller;

import com.micro.order_service.DTO.OrderRequestDTO;
import com.micro.order_service.DTO.OrderResponseDTO;
import com.micro.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    @PostMapping("/place")
    public OrderResponseDTO placeOrder(@RequestBody OrderRequestDTO request) {
        return orderService.placeOrder(request);
    }
}
