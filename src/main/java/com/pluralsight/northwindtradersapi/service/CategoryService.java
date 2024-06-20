package com.pluralsight.northwindtradersapi.service;

import com.pluralsight.northwindtradersapi.dao.CategoryDAO;
import com.pluralsight.northwindtradersapi.dao.CategoryDAOImpl;
import com.pluralsight.northwindtradersapi.dao.ProductDAO;
import com.pluralsight.northwindtradersapi.models.Category;
import com.pluralsight.northwindtradersapi.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryService {

    private final CategoryDAO categoryDAO;

    @Autowired
    public CategoryService(CategoryDAO categoryDAOImpl) {
        this.categoryDAO = categoryDAOImpl;
    }

    public List<Category> getAllCategories() {
        return categoryDAO.getAllCategories();
    }

    public Category getCategoryById(int id) {
        return categoryDAO.getCategoryById(id);
    }

}
