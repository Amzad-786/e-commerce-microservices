package com.micro.order_service.client;

import com.micro.order_service.DTO.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@FeignClient(name = "PRODUCT-SERVICE")
//@RequestMapping("/api/product/")
public interface ProductClient {
    @GetMapping("/api/product/productById/{id}")
    ProductResponse getProduct(@PathVariable UUID id);
}
