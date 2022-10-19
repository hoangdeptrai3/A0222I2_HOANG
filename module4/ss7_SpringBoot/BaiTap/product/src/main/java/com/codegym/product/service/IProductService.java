package com.codegym.product.service;

import com.codegym.product.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void add(Product product);
    void delete(Long id);
}
