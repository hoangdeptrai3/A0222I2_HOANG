package com.example.demo.service.impl;

import com.example.demo.model.Phone;
import com.example.demo.repository.PhoneRepository;
import com.example.demo.service.IPhoneService;
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

    @Override
    public void add(Phone phone) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Phone edit(Long id) {
        return null;
    }

    @Override
    public List<Phone> search(String name) {
        return null;
    }
}
