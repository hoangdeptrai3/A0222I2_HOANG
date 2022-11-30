package com.example.mobile.sẻvice;

import com.example.mobile.DTO.PhoneDTO;
import com.example.mobile.model.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IPhoneService {
    Page<Phone> findAll(String name, Pageable pageable);
    void save(Phone phone);
    void delete(Long id);
    Phone findByid(Long id);
    void save_ajax(PhoneDTO phoneDTO);
}
