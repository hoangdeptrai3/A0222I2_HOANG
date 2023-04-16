package com.example.demo.service;

import com.example.demo.model.Phone;

import java.util.List;

public interface IPhoneService {
    List<Phone> findAll();
    void save(Phone phone);
    Phone edit(Long id);
    List<Phone> search(String name);
    void delete(Long id);
}
