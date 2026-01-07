package com.example.product2.service;

import com.example.product2.dtos.CreateProductDto;
import com.example.product2.dtos.ProductResponseDto;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    ProductResponseDto createProduct(CreateProductDto createProductDto);
    ProductResponseDto getProductById(Long id);
    List<ProductResponseDto> getAllProducts();
    ProductResponseDto updateProduct(Long id, ProductResponseDto productResponseDto);
    void deleteProduct(Long id);
}
