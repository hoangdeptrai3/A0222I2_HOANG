package service.impl;

import model.Product;
import repository.IProductRepository;
import repository.impl.ProductRepository;
import service.IProductService;

import java.sql.SQLException;
import java.util.List;

public class ProductService implements IProductService {
    IProductRepository productRepository = new ProductRepository();
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void create(Product product) {
        productRepository.create(product);
    }

    @Override
    public boolean edit(Product product) throws SQLException {
        return productRepository.edit(product);
    }
    public List<Product> search(String name){
        return productRepository.search(name);
    }

    @Override
    public boolean delete(int id) {
        return productRepository.delete(id);
    }
}
