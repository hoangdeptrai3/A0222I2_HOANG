package service.impl;

import repository.impl.BRepository;
import service.IBService;

import java.util.List;

public class BService implements IBService {
    BRepository bRepository  = new BRepository();
    @Override
    public List<Category> findAll() {
        return bRepository.findAll();
    }
}
