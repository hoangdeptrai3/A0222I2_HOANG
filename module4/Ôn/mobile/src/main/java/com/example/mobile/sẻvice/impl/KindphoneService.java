package com.example.mobile.sẻvice.impl;

import com.example.mobile.model.KindPhone;
import com.example.mobile.repository.KindPhoneRepository;
import com.example.mobile.sẻvice.IKindPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("kindPhone")
public class KindphoneService implements IKindPhoneService {
    @Autowired
    private KindPhoneRepository kindPhoneRepository;
    @Override
    public List<KindPhone> findALL() {
        return kindPhoneRepository.findAll();
    }
}
