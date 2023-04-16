package com.example.demovip.service.impl;

import com.example.demovip.model.Product;

import java.util.List;

public interface IproductService {
    List<Product> findAll();
    void save(Product product);
    void delete(Long id);
    Product edit(Long id);
    List<Product> search(String name);
}
