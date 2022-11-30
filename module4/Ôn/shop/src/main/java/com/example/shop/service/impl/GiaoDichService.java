package com.example.shop.service.impl;

import com.example.shop.model.GiaoDich;
import com.example.shop.repository.GiaoDichRepository;
import com.example.shop.service.IGiaoDichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service("giaodich")
public class GiaoDichService implements IGiaoDichService {
    @Autowired
    private GiaoDichRepository giaoDichRepository;
    @Override
    public Page<GiaoDich> findAll(String name, Pageable pageable) {
        return giaoDichRepository.findAll(name,pageable);
    }

    @Override
    public void save(GiaoDich giaoDich) {
        giaoDichRepository.save(giaoDich);
    }

    @Override
    public void delete(Long id) {
        giaoDichRepository.deleteById(id);
    }

    @Override
    public GiaoDich edit(Long id) {
        return giaoDichRepository.findById(id).orElse(null);
    }
}
