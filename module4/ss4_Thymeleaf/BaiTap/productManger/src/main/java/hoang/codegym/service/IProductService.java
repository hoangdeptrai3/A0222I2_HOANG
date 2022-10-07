package hoang.codegym.service;

import hoang.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);
    void delete(int id);
    List<Product> findbyName(String name);
    Product edit(int id);
}
