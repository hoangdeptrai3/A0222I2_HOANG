package com.example.phone.service.impl;

import com.example.phone.model.LoaiSach;
import com.example.phone.repository.LoaiSachRepository;
import com.example.phone.service.ILoaiSachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("loaiSach")
public class LoaiSachService implements ILoaiSachService {
    @Autowired
    private LoaiSachRepository loaiSachRepository;
    @Override
    public List<LoaiSach> findAll() {
        return loaiSachRepository.findAll();
    }
}
