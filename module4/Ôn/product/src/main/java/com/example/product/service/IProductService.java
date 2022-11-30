package com.example.product.service;

import com.example.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
//    List<Product> findAll();
    Page<Product> findAll(String name,Pageable pageable);

    void save(Product product);
    void delete(Long id);
   Product findbyid(Long id);

}
