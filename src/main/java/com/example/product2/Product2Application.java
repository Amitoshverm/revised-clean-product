package com.example.product2;

import com.example.product2.model.Category;
import com.example.product2.model.Product;
import com.example.product2.repository.CategoryRepository;
import com.example.product2.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Product2Application implements CommandLineRunner {

	private ProductRepository productRepository;
	private CategoryRepository categoryRepository;
	public Product2Application(ProductRepository productRepository, CategoryRepository categoryRepository) {
		this.productRepository = productRepository;
		this.categoryRepository = categoryRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(Product2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category category = new Category();
		category.setName("electronics");
//		this.categoryRepository.save(category);

//		Product product = new Product();
//		product.setTitle("Samsung Galaxy S21");
//		product.setDescription("Latest Samsung smartphone with advanced features");
//		product.setCategory(category);
//		product.setPrice(799.99);
//		this.productRepository.save(product);
//
//		Category category2 = new Category();
//		category2.setName("beauty");
//
//		Product product2 = new Product();
//		product2.setTitle("face cream");
//		product2.setDescription("best face cream for glowing skin");
//		product2.setCategory(category2);
//		product2.setPrice(19.99);
//		this.productRepository.save(product2);

		Product product3 = new Product();
		product3.setTitle("iphone");
		product3.setDescription("best iphone ever");
		product3.setCategory(category);
		product3.setPrice(199990.0);
		this.productRepository.save(product3);


	}
}
