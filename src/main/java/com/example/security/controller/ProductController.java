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

    @PostMapping
    public ResponseEntity<Void> testCallProduct(@RequestBody ProductRequestDto product) {
        productService.save(product);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductResponseDto> findProductById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.findById(id));
    }
    @PostMapping
    public ResponseEntity<ProductResponseDto> saveProduct(@RequestBody ProductRequestDto dto) {
        return ResponseEntity.ok(productService.save(dto));
    }

    @GetMapping
    public ResponseEntity<List<ProductResponseDto>> findAllProducts() {
        return ResponseEntity.ok(productService.findAll());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteProductById(@PathVariable Long id) {
        productService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

}
