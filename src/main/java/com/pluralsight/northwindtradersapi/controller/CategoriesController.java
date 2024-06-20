package com.pluralsight.northwindtradersapi.controller;

import com.pluralsight.northwindtradersapi.models.Category;
import com.pluralsight.northwindtradersapi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

// Categories rest controller
@RestController
public class CategoriesController {
    private final CategoryService categoryService;

    @Autowired
    public CategoriesController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(path="/categories", method= RequestMethod.GET)
    public List<Category> categories() {
        return categoryService.getAllCategories();
    }

    @RequestMapping(path="/categories/{id}", method=RequestMethod.GET)
    public Category getCategories(@PathVariable int id) {
        return categoryService.getCategoryById(id);
    }
}
