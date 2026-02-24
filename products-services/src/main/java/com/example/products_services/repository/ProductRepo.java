package com.example.products_services.repository;

import com.example.products_services.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepo extends JpaRepository<Products, UUID> {
}
