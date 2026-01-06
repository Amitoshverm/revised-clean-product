package com.example.product2.model;

import jakarta.persistence.OneToMany;

import java.util.List;

public class Category extends BaseClass {

    private String name;
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
