package com.example.security.service.impl;

import com.example.security.controller.dto.request.ProductRequestDto;
import com.example.security.controller.dto.response.ProductResponseDto;
import com.example.security.domain.entity.Product;
import com.example.security.mapper.productMapper;
import com.example.security.repository.jpa.ProductJpa;
import com.example.security.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final productMapper productMapper;
    private final ProductJpa productJpa;

    public ProductServiceImpl(productMapper productMapper, ProductJpa productJpa) {
        this.productMapper = productMapper;
        this.productJpa = productJpa;
    }

    @Override
    public ProductResponseDto save(ProductRequestDto dto) {
        Product product = productMapper.toEntity(dto);
        Product save = productJpa.save(product);
        return productMapper.toDto(save);
    }

    @Override
    public List<ProductResponseDto> findAll() {
        List<Product> productList = productJpa.findAll();
        return productMapper.toDtoList(productList);
    }

    @Override
    public ProductResponseDto findById(Long id) {
        Product product = productJpa.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "product not found"));
        return productMapper.toDto(product);
    }

    @Override
    public void deleteById(Long id) {

    }
}
