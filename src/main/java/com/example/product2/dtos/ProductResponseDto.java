package com.example.product2.dtos;

import com.example.product2.model.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDto {
    private String title;
    private String description;
    private Category category;
    private double price;
}
