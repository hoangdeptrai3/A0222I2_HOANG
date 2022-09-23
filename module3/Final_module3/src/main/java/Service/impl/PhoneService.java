package Service.impl;

import Model.Phone;
import Repository.impl.PhoneRepository;
import Service.IPhoneService;

import java.sql.SQLException;
import java.util.List;

public class PhoneService implements IPhoneService {
    PhoneRepository phoneRepository = new PhoneRepository();
    @Override
    public List<Phone> findAll() {
        return phoneRepository.findAll();
    }

    @Override
    public void create(Phone phone) {
        phoneRepository.create(phone);
    }

    @Override
    public boolean edit(Phone phone) throws SQLException {
        return phoneRepository.edit(phone);
    }

    @Override
    public boolean delete(int id) {
        return phoneRepository.delete(id);
    }

    @Override
    public List<Phone> search(String name) {
        return phoneRepository.search(name);
    }
}
