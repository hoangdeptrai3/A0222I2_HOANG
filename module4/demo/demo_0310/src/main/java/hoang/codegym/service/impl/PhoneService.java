package hoang.codegym.service.impl;

import hoang.codegym.model.Phone;
import hoang.codegym.repository.IPhoneRepositoty;
import hoang.codegym.repository.impl.PhoneRepository;
import hoang.codegym.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("phoneService")
public class PhoneService implements IPhoneService {
@Autowired
private IPhoneRepositoty phoneRepositoty;
    @Override
    public List<Phone> findAll() {
        return phoneRepositoty.findAll();
    }

    @Override
    public void save(Phone phone) {
        phoneRepositoty.save(phone);
    }

    @Override
    public void delete(int id) {
        phoneRepositoty.delete(id);
    }
}
