package com.example.security.controller;

import com.example.security.dao.ProductRepository;
import com.example.security.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    @PostMapping("save")
    public void testCallProduct(@RequestBody Product product) {
        productRepository.save(product);
    }

}
