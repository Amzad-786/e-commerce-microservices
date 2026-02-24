package com.example.products_services.service;

import com.example.products_services.dto.ProductCreateRequest;
import com.example.products_services.dto.ProductResponse;

public interface Product {
    ProductResponse createProduct(ProductCreateRequest createDto);
}
