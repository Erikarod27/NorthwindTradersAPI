package com.pluralsight.northwindtradersapi.service;

import com.pluralsight.northwindtradersapi.dao.ProductDAO;
import com.pluralsight.northwindtradersapi.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ProductService {

    private final ProductDAO productDAO;

    @Autowired
    public ProductService(ProductDAO productDAOImpl) {
        this.productDAO = productDAOImpl;
    }

    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }

    public Product getProductById(int id) {
        return productDAO.getProductById(id);
    }

}
