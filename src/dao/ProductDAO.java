package dao;

import dto.Product;
import java.util.List;

public interface ProductDAO {

    void addProduct(Product product);
    void updateProduct(int id, int quantity);
    void deleteProduct(int id);
    List<Product> getAllProducts();
}
