package hoang.codegym.service;

import hoang.codegym.model.Phone;

import java.util.List;

public interface IPhoneService {
    List<Phone> findAll();
    void save(Phone phone);
    void delete(int id);
}
