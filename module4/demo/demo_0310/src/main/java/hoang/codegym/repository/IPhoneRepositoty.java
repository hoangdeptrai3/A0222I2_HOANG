package hoang.codegym.repository;

import hoang.codegym.model.Phone;

import java.util.List;

public interface IPhoneRepositoty {
    List<Phone> findAll();
    void save(Phone phone);
    void delete(int id);
}
