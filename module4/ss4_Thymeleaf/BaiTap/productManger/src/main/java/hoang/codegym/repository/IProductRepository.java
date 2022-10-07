package hoang.codegym.repository;

import hoang.codegym.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    void save(Product product);
    void delete(int id);
    List<Product> findbyName(String name);
    Product edit(int id);
}
