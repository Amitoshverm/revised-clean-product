package com.example.product2.service;

import com.example.product2.model.Category;

import java.util.Optional;

public interface CategoryService {
    Category getCategoryById(Long id);
    Category createCategory(Category categoryDto);
    Category updateCategory(Long id, Category categoryDto);
}
