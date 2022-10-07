package hoang.codegym.service.imp;

import hoang.codegym.model.Product;
import hoang.codegym.repository.IProductRepository;
import hoang.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("serviceProduct")
public class ProductService implements IProductService {
    @Autowired
    IProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(int id) {
        productRepository.delete(id);
    }

    @Override
    public List<Product> findbyName(String name) {
        return productRepository.findbyName(name);
    }

    @Override
    public Product edit(int id) {
        return productRepository.edit(id);
    }
}
