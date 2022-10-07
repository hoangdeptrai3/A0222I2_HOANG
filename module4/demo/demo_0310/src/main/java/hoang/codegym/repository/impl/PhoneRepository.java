package hoang.codegym.repository.impl;

import hoang.codegym.model.Phone;
import hoang.codegym.repository.IPhoneRepositoty;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PhoneRepository implements IPhoneRepositoty {
    static List<Phone> phones = new ArrayList<>();
    static {
        phones.add(new Phone(1,"iphone","Viet Nam"));
        phones.add(new Phone(2,"Sam Sung","Korea"));
        phones.add(new Phone(3,"Xiaomi","China"));
    }
    @Override
    public List<Phone> findAll() {
        return phones;
    }

    @Override
    public void save(Phone phone) {
        phones.add(phone);
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i <phones.size() ; i++) {
            if(phones.get(i).getId()==id){
                phones.remove(phones.get(i));
            }
        }

    }
}
