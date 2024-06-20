package com.pluralsight.northwindtradersapi.controller;

import com.pluralsight.northwindtradersapi.models.Product;
import com.pluralsight.northwindtradersapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Product rest controller
@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(path="/products", method=RequestMethod.GET)
    public List<Product> products() {
        return productService.getAllProducts();
    }

    @RequestMapping(path="/products/{id}", method=RequestMethod.GET)
    public Product getProducts(@PathVariable int id) {
        return productService.getProductById(id);
    }
}
