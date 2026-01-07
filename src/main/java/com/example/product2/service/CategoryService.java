package com.example.product2.service;

import com.example.product2.dtos.CategoryDto;
import com.example.product2.model.Category;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

public interface CategoryService {
    CategoryDto getCategoryById(Long id);
    CategoryDto createCategory(CategoryDto categoryDto);
    CategoryDto updateCategory(Long id, CategoryDto categoryDto);
    Optional<CategoryDto> findCategoryByName(String name);
}
