package demo.demo999.service;

import demo.demo999.model.Phone;

import java.util.List;

public interface IphoneService {
    List<Phone> findAll();
    void save(Phone phone);
    void delete(Long id);
    Phone findByID(Long id);
    List<Phone> search(String name);
}
