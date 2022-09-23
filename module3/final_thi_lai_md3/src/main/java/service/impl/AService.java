package service.impl;

import repository.impl.ARepository;
import service.IAService;

import java.sql.SQLException;
import java.util.List;

public class AService implements IAService {
    ARepository aRepository = new ARepository();
    @Override
    public List<Product> findAll() {
        return aRepository.findAll();
    }
//
//    @Override
//    public void create(Product product) {
//        aRepository.create();
//    }
//
//    @Override
//    public boolean edit(Product product) throws SQLException {
//        return aRepository.edit(product);
//    }
//
//    @Override
//    public boolean delete(int id) {
//        return aRepository.delete(id);
//    }
//
//    @Override
//    public List<Product> search(String name) {
//        return aRepository.search(name);
//    }
}
