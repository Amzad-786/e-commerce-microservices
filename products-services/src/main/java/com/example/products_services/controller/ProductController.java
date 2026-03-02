package com.example.products_services.controller;

import com.example.products_services.common.ApiResponse;
import com.example.products_services.dto.ProductCreateRequest;
import com.example.products_services.dto.ProductResponse;
import com.example.products_services.service.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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
    @GetMapping("productById/{id}")
    public ResponseEntity<ApiResponse<ProductResponse>> productById(@PathVariable UUID id){
        ProductResponse product = _service.getById(id);
        return ResponseEntity.ok(new ApiResponse<ProductResponse>(true,"Success",1,product));
    }
    @GetMapping("getAllProducts")
    public ResponseEntity<ApiResponse<List<ProductResponse>>> getAllProducts(){
        List<ProductResponse> res = _service.getAll();
        return ResponseEntity.ok(new ApiResponse<>(true,"Success",res.size(),res));
    }
}
