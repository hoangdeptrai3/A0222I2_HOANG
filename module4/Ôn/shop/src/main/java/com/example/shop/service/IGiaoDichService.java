package com.example.shop.service;

import com.example.shop.model.GiaoDich;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IGiaoDichService {
    Page<GiaoDich> findAll(String name, Pageable pageable);
    void save(GiaoDich giaoDich);
    void delete(Long id);
    GiaoDich edit(Long id);
}
