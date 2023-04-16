package com.example.demovip.service;

import com.example.demovip.model.Product;
import com.example.demovip.repository.ProductRepository;
import com.example.demovip.service.impl.IproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service("product")
public class ProductService implements IproductService {
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
    public Product edit(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> listNew = new ArrayList<>();
        for (Product p : productRepository.findAll()) {
            if (p.getName().equals(name)){
                listNew.add(p);
            }
        }
        return listNew;
    }
}
