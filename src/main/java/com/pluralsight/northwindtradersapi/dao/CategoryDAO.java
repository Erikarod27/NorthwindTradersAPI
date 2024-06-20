package com.pluralsight.northwindtradersapi.dao;

import com.pluralsight.northwindtradersapi.models.Category;
import com.pluralsight.northwindtradersapi.models.Product;

import java.util.List;

public interface CategoryDAO {
    Category getCategoryById(int id);
    List<Category> getAllCategories();
}
