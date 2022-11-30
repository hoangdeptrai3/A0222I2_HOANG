package com.example.product.service;

import com.example.product.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
//    Page<Category> findAll(Pageable pageable);
}
