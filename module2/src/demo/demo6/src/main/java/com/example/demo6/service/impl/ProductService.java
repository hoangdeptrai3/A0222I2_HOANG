package com.example.demo6.service.impl;

import com.example.demo6.model.Product;
import com.example.demo6.repository.ProductRepository;
import com.example.demo6.service.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("product")
public class ProductService implements IProduct {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product findByID(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> search(String name) {
        return null;
    }
}
