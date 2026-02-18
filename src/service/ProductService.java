package service;

import dao.ProductDAO;
import dao.ProductDAOImpl;
import dto.Product;

import java.util.List;

public class ProductService {

    private ProductDAO dao = new ProductDAOImpl();

    public void addProduct(Product product) {
        dao.addProduct(product);
    }

    public void updateProduct(int id, int quantity) {
        dao.updateProduct(id, quantity);
    }

    public void deleteProduct(int id) {
        dao.deleteProduct(id);
    }

    public List<Product> viewProducts() {
        return dao.getAllProducts();
    }
}
