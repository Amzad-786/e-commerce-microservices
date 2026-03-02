package com.micro.order_service.client;

import com.micro.order_service.DTO.UserResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@FeignClient(name = "USER-SERVICE")
//@RequestMapping("/users")
public interface UserClient {
    @GetMapping("/users/{id}")
    UserResponseDTO getUser(@PathVariable UUID id);
}
