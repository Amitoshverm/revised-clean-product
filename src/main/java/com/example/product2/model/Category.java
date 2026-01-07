package com.example.product2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category extends BaseClass {

    private String name;

//    @OneToMany(mappedBy = "category")
//    private List<Product> products;
}
