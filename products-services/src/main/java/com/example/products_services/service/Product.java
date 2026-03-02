package com.example.products_services.service;

import com.example.products_services.dto.ProductCreateRequest;
import com.example.products_services.dto.ProductResponse;

import java.util.List;
import java.util.UUID;

public interface Product {
    ProductResponse createProduct(ProductCreateRequest createDto);
    ProductResponse getById(UUID id);
    List<ProductResponse> getAll();
}
