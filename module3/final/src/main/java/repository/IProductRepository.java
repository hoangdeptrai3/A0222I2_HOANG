package repository;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    void create(Product product);
    boolean edit(Product product) throws SQLException;
    boolean delete(int id);
    List<Product> search(String name);
}
