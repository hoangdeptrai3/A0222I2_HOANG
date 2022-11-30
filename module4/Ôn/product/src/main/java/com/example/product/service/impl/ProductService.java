package com.example.product.service.impl;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;
import com.example.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service("product")
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;

//    @Override
//    public List<Product> findAll() {
//        return productRepository.findAll();
//    }

    @Override
    public Page<Product> findAll(String name,Pageable pageable) {
        return productRepository.findAll(name,pageable);
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
    public Product findbyid(Long id) {
        return productRepository.findById(id).orElse(null);
    }

//    @Override
//    public List<Product> search(String name) {
//        List<Product> products = new ArrayList<>();
//        for (Product product : productRepository.findAll()) {
//            if (product.getName().equals(name)) {
//                products.add(product);
//            }
//        }
//        return products;
//    }
}
