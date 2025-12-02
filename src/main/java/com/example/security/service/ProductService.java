package com.example.security.service;

import com.example.security.controller.dto.request.ProductRequestDto;
import com.example.security.controller.dto.response.ProductResponseDto;

import java.util.List;

public interface ProductService {

    ProductResponseDto save(ProductRequestDto dto);

    List<ProductResponseDto> findAll();

    ProductResponseDto findById(Long id);

    void deleteById(Long id);
}
