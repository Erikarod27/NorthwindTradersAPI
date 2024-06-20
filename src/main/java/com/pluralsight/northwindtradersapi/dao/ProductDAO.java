package com.pluralsight.northwindtradersapi.dao;

import com.pluralsight.northwindtradersapi.models.Product;

import java.util.List;

public interface ProductDAO {
    Product getProductById(int id);
    List<Product> getAllProducts();
}
