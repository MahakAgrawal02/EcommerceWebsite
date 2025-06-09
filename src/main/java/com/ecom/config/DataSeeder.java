package com.ecom.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ecom.model.Category;
import com.ecom.model.Product;
import com.ecom.repositories.CategoryRepository;
import com.ecom.repositories.ProductRepository;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository){
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        productRepository.deleteAll();
        categoryRepository.deleteAll();

        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category home = new Category();
        home.setName("Home and Kitchen"); 

        categoryRepository.saveAll(Arrays.asList(electronics, clothing, home));
        

        Product phone = new Product();
        phone.setName("Smart Phone");
        phone.setDescription("Latest and amazing");
        phone.setImageUrl("https://placehold.co/600x400");
        phone.setPrice(7000.0);
        phone.setCategory(electronics);

        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription("High performance");
        laptop.setImageUrl("https://placehold.co/600x400");
        laptop.setPrice(20000.0);
        laptop.setCategory(electronics);

        Product jacket = new Product();
        jacket.setName("Winter jacket");
        jacket.setDescription("Warm and cozy");
        jacket.setImageUrl("https://placehold.co/600x400");
        jacket.setPrice(1000.0);
        jacket.setCategory(clothing);

        Product blender = new Product();
        blender.setName("Blender");
        blender.setDescription("High-speed");
        blender.setImageUrl("https://placehold.co/600x400");
        blender.setPrice(2000.0);
        blender.setCategory(home);

        productRepository.saveAll(Arrays.asList(phone, laptop, jacket, blender));

    }

}
