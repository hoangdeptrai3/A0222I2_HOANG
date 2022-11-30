package com.example.shop.service.impl;

import com.example.shop.model.KhachHang;
import com.example.shop.repository.KhachHangRepository;
import com.example.shop.service.IKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("khachhang")
public class KhacHangService implements IKhachHangService {
    @Autowired
    private KhachHangRepository khachHangRepository;
    @Override
    public List<KhachHang> findAll() {
        return khachHangRepository.findAll();
    }
}
