package com.example.product2.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CreateProductDto {
    private String title;
    private String description;
    private double price;
    private UUID categoryId;
}
