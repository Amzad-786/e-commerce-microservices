package com.example.products_services.service.impl;

import com.example.products_services.dto.ProductCreateRequest;
import com.example.products_services.dto.ProductResponse;
import com.example.products_services.entity.Products;
import com.example.products_services.repository.ProductRepo;
import com.example.products_services.service.Product;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductImpl implements Product {
    @Autowired
    private ProductRepo _repo;
    @Override
    public ProductResponse createProduct(ProductCreateRequest dto){
        Products product = new Products();
        product.setName(dto.getName());
        product.setBrand(dto.getBrand());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setImageUrl(dto.getImageUrl());
        product.setStockQuantity(dto.getStockQuantity());
        _repo.save(product);
        ProductResponse res = new ProductResponse();
        res.setId(product.getId());
        res.setName(product.getName());
        res.setDescription(product.getDescription());
        res.setCreatedAt(product.getCreatedAt());
        res.setUpdatedAt(product.getUpdatedAt());
        res.setBrand(product.getBrand());
        res.setPrice(product.getPrice());
        res.setStockQuantity(product.getStockQuantity());
        res.setImageUrl(product.getImageUrl());
        return res;
    }
    @Override
    public ProductResponse getById(UUID id){
        Products product = _repo.findById(id).orElseThrow(() -> new NotFoundException("Product not found with id: " + id));
        return new ProductResponse(product);
    }
    @Override
    public List<ProductResponse> getAll(){
        List<Products> products = _repo.findAll();
        return products.stream()
                .map(ProductResponse::new)
                .toList();
    }
}
