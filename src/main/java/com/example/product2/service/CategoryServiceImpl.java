package com.example.product2.service;

import com.example.product2.model.Category;
import com.example.product2.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category getCategoryById(Long id) {
        Category category = this.categoryRepository.findById(id).orElseThrow(()-> new RuntimeException("Category not found with id: " + id));
        return category;
    }

    @Override
    public Category createCategory(Category category) {
        this.categoryRepository.save(category);
        return category;
    }

    @Override
    public Category updateCategory(Long id, Category category) {
       Category category1 = this.categoryRepository.findById(id).orElseThrow(()-> new RuntimeException("Category not found with id: " + id));
       category1.setName(category.getName());
       return null;
    }


}
