package com.example.security.mapper;

import com.example.security.controller.dto.request.ProductRequestDto;
import com.example.security.controller.dto.response.ProductResponseDto;
import com.example.security.domain.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface productMapper {
    Product toEntity(ProductRequestDto dto);

    ProductResponseDto toDto(Product entity);

    List<ProductResponseDto> toDtoList(List<Product> productList);
}