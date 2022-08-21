package sevice.impl;

import model.Product;
import repository.IProductRepository;
import repository.impl.ProductRepository;
import sevice.IProductService;

import java.awt.print.Book;
import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Book findBy(String name) {
        return null;
    }

    @Override
    public boolean add(Product product) {
       productRepository.add(product);
       return true;
    }
}
