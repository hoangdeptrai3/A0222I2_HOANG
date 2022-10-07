package hoang.codegym.repository.impl;

import hoang.codegym.model.Product;
import hoang.codegym.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductRepository implements IProductRepository {
   static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1,"phone",20002,"VN"));
        products.add(new Product(2,"cake",40000,"china"));
        products.add(new Product(3,"food",2300,"USA"));

    }
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i<products.size();i++){
            if (products.get(i).getId() == id){
                products.remove(i);
                break;
            }
        }
    }

    @Override
    public List<Product> findbyName(String name) {
        List<Product> productList = new ArrayList<>();
        for (Product pro : products){
            if (pro.getName().equalsIgnoreCase(name)){
                productList.add(pro);
            }
        }
        return productList;
    }

    @Override
    public Product edit(int id) {
        Product productList = new Product();
        for (int i = 0;i<products.size();i++){
            if (products.get(i).getId()==id){
                productList = products.get(i);
            }
        }
        return productList;
    }
}
