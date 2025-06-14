package com.arpon.ecom_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arpon.ecom_project.model.Product;
import com.arpon.ecom_project.repo.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;
    
    public List<Product> getAllProducts() {
        return repo.findAll();
    }
    
    public Product addProduct(Product product) {
        return repo.save(product);
    }
    
    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }
}
