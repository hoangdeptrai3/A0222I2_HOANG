package com.codegym.product.service.impl;

import com.codegym.product.model.Product;
import com.codegym.product.repository.ProductRepository;
import com.codegym.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service("productService")
public class ProductService implements IProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void add(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product edit(Long id) {
        return productRepository.getReferenceById(id);
    }

//    @Override
//    public List<Product> search(String name) {
//       List<Product> productList = new ArrayList<>();
//        for (Product p : productRepository.findAll()) {
//                if (p.getName().equals(name)){
//                    productList.add(p);
//                }
//        }
//        return productList;
//    }
@Override
public Product search(Long id) {
    return productRepository.findById(id).orElse(null);
}

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return this.productRepository.findAll(pageable);
    }


}
