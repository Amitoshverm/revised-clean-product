package com.example.product2.service;

import com.example.product2.dtos.CreateProductDto;
import com.example.product2.dtos.ProductResponseDto;
import com.example.product2.model.Category;
import com.example.product2.model.Product;

import java.util.List;
import java.util.UUID;

public class ProductServiceImpl implements ProductService {
    private ProductResponseDto productResponseDto;

    public ProductServiceImpl(ProductResponseDto productResponseDto) {
        this.productResponseDto = productResponseDto;
    }

    @Override
    public ProductResponseDto createProduct(CreateProductDto createProductDto) {
        Product product = new Product();
        product.setTitle(createProductDto.getTitle());
        product.setDescription(createProductDto.getDescription());
        product.setPrice(createProductDto.getPrice());
        return null;

    }

    @Override
    public ProductResponseDto getProductById(Long id) {
        return null;
    }

    @Override
    public List<ProductResponseDto> getAllProducts() {
        return List.of();
    }

    @Override
    public ProductResponseDto updateProduct(Long id, ProductResponseDto productResponseDto) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {
        return;
    }
}
