package com.example.security.repository.jpa;

import com.example.security.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpa extends JpaRepository<Product, Long> {
}
