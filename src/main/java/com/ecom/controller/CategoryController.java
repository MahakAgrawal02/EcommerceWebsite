package com.ecom.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Category;
import com.ecom.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/categories")
public class CategoryController {
    
    private final CategoryService categoryService;
    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

}
