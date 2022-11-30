package com.example.mobile.sẻvice.impl;

import com.example.mobile.DTO.PhoneDTO;
import com.example.mobile.model.KindPhone;
import com.example.mobile.model.Phone;
import com.example.mobile.repository.KindPhoneRepository;
import com.example.mobile.repository.PhoneRepository;
import com.example.mobile.sẻvice.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service("phone")
public class PhoneService implements IPhoneService {
    @Autowired
    private PhoneRepository phoneRepository;

    @Autowired
    private KindPhoneRepository kindPhoneRepository;
    @Override
    public Page<Phone> findAll(String name, Pageable pageable) {
        return phoneRepository.findAll(name,pageable);
    }

    @Override
    public void save(Phone phone) {
        phoneRepository.save(phone);
    }

    @Override
    public void delete(Long id) {
        phoneRepository.deleteById(id);
    }

    @Override
    public Phone findByid(Long id) {
       return phoneRepository.findById(id).orElse(null);
    }

    @Override
    public void save_ajax(PhoneDTO phoneDTO) {
        Phone phone = new Phone();
        phone.setName(phoneDTO.getName());
        phone.setPrice(phoneDTO.getPrice());
        KindPhone ls = kindPhoneRepository.findById(phoneDTO.getKindPhone()).orElse(null);
        phone.setKindPhone(ls);
        phoneRepository.save(phone);
    }
}
