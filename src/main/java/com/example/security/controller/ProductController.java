package com.example.security.controller;

import com.example.security.controller.dto.request.EmployeeRequestDto;
import com.example.security.controller.dto.request.ProductRequestDto;
import com.example.security.controller.dto.response.EmployeeResponseDto;
import com.example.security.controller.dto.response.ProductResponseDto;
import com.example.security.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping("{id}")
    public ResponseEntity<ProductResponseDto> findProductById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<ProductResponseDto>> findAllProducts() {
        return ResponseEntity.ok(productService.findAll());
    }

    @PostMapping
    public ResponseEntity<ProductResponseDto> saveProduct(@RequestBody ProductRequestDto dto) {
        return ResponseEntity.ok(productService.save(dto));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteProductById(@PathVariable Long id) {
        productService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

}
