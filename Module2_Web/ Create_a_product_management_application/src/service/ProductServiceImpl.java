package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> list;

    static {
        list = new HashMap<>();
        list.put(1, new Product(1, "Exciter", 50000, "135-150 cc , động cơ 5 hợp số , hệ số côn tay", "yamaha"));
        list.put(2, new Product(2, "Sirius", 50000, "110 cc , động cơ 4 hợp số , hệ số côn tự động", "yamaha"));


    }

    @Override
    public Product see_product_details(int id) {
        return list.get(id);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(list.values());
    }

    @Override
    public void save(Product product) {
        list.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        list.put(id, product);
    }

    @Override
    public void remove(int id) {
        list.remove(id);
    }

    @Override
    public Product findByName(String name) {
        return list.get(name);
    }


}
