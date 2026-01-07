package com.example.product2.controller;

import com.example.product2.dtos.CategoryDto;
import com.example.product2.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public CategoryDto createCategory(@RequestBody CategoryDto category) {
        System.out.println(category.getName());
        return categoryService.createCategory(category);
    }

    @GetMapping("/{id}")
    public CategoryDto getCategoryById(@PathVariable("id") Long id) {
        return categoryService.getCategoryById(id);
    }

    @PutMapping("/{id}")
    public CategoryDto updateCategory(@PathVariable("id") Long id, @RequestBody CategoryDto category) {
        return categoryService.updateCategory(id, category);
    }
    @GetMapping("/by-name/{name}")
    public Optional<CategoryDto> findCategoryByName(@PathVariable("name") String name) {
        return categoryService.findCategoryByName(name);
    }
}
