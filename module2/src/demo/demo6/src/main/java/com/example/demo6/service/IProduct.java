package com.example.demo6.service;

import com.example.demo6.model.Product;

import java.util.List;

public interface IProduct {
    List<Product> findAll();
    void save(Product product);
    void delete(Long id);
    Product findByID(Long id);
    List<Product> search(String name);
}
