package demo.demo999.service.impl;

import demo.demo999.model.Phone;
import demo.demo999.repository.PhoneRepository;
import demo.demo999.service.IphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("phone")
public class PhoneService implements IphoneService {
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
    public void delete(Long id) {
        phoneRepository.deleteById(id);
    }

    @Override
    public Phone findByID(Long id) {
        return phoneRepository.findById(id).orElse(null);
    }

    @Override
    public List<Phone> search(String name) {
        return null;
    }
}
