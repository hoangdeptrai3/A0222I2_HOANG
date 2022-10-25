package com.codegym.product.service;

import com.codegym.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void add(Product product);
    void delete(Long id);
    Product edit(Long id);
    Product search(Long id);
    Page<Product> findAll(Pageable pageable);
}
