package com.example.products_services.controller;

import com.example.products_services.dto.ProductCreateRequest;
import com.example.products_services.dto.ProductResponse;
import com.example.products_services.service.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product/")
public class ProductController {
    @Autowired
    private Product _service;
    @PostMapping("createProduct")
    public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductCreateRequest dto){
        var result = _service.createProduct(dto);
        return ResponseEntity.ok(result);
    }
}
