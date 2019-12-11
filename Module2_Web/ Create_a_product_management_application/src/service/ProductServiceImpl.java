package service;

import model.Product;

import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer,Product> products;
    static {
        products.put(1,new Product(1,"Exciter",50000,"135-150 cc , động cơ 5 hợp số , hệ số côn tay" ,"yamaha"));
        products.put(2,new Product(2,"Siríu",50000,"135-150 cc , động cơ 5 hợp số , hệ số côn tay" ,"yamaha"));
        products.put(3,new Product(3,"Exciter",50000,"135-150 cc , động cơ 5 hợp số , hệ số côn tay" ,"yamaha"));

    }

    @Override
    public Product see_product_details(int id) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public Product findByName(String name) {
        return null;
    }
}
