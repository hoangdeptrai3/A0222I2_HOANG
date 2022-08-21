package repository;

import model.Product;

import java.awt.print.Book;
import java.util.List;

public interface IProductRepository {
    public List<Product> findAll();
    public Book findBy(String name);
    public boolean add(Product book);
}
