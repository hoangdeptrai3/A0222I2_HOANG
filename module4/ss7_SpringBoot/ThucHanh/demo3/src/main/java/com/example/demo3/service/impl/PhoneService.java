package com.example.demo3.service.impl;

import com.example.demo3.model.Phone;
import com.example.demo3.repository.PhoneRepository;
import com.example.demo3.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("phone")
public class PhoneService implements IPhoneService {
    @Autowired
    private PhoneRepository phoneRepository;

    @Override
    public List<Phone> findAll() {
        return phoneRepository.findAll();
    }
}
