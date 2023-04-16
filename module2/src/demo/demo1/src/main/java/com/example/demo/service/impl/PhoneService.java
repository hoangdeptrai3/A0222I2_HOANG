package com.example.demo.service.impl;

import com.example.demo.model.Phone;
import com.example.demo.repository.PhoneRepository;
import com.example.demo.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public void save(Phone phone) {
        phoneRepository.save(phone);
    }

    @Override
    public Phone edit(Long id) {
        return phoneRepository.findById(id).orElse(null);
    }

    @Override
    public List<Phone> search(String name) {
        List<Phone> phones = new ArrayList<>();
        for (Phone p : phoneRepository.findAll()){
            if (p.getName().equalsIgnoreCase(name)){
                phones.add(p);
            }
        }
        return phones;
    }

    @Override
    public void delete(Long id) {
        phoneRepository.deleteById(id);
    }
}
