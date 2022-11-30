package com.example.product.service.impl;

import com.example.product.model.Category;
import com.example.product.repository.CategoryRepository;
import com.example.product.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("category")
public class CategoryService implements ICategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

//    @Override
//    public Page<Category> findAll(Pageable pageable) {
//        return categoryRepository.findAll(pageable);
//    }
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
