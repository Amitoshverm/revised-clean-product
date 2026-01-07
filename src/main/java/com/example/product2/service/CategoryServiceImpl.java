package com.example.product2.service;

import com.example.product2.dtos.CategoryDto;
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
    public CategoryDto getCategoryById(Long id) {
        Category category = this.categoryRepository.findById(id).orElseThrow(()-> new RuntimeException("Category not found with id: " + id));
        return new CategoryDto(category.getName());
    }

    @Override
    public CategoryDto createCategory(CategoryDto category) {
        Category category1 = new Category(category.getName());
        this.categoryRepository.save(category1);
        return new CategoryDto(category1.getName());
    }

    @Override
    public CategoryDto updateCategory(Long id, CategoryDto category) {
       Category category1 = this.categoryRepository.findById(id).orElseThrow(()-> new RuntimeException("Category not found with id: " + id));
       category1.setName(category.getName());
       return null;
    }

    @Override
    public Optional<CategoryDto> findCategoryByName(String name) {
        Optional<Category> category = this.categoryRepository.findByName(name);
        return category.map(cat -> new CategoryDto(cat.getName()));
    }
}
