package java8andlombok;

import lombok.extern.java.Log;
import java.util.List;
@Log
public class ProductService {
    public void addProduct(Product product, List<Product> productList) {
        try {
            productList.add(product);
            log.info("Product added successfully: " + product);
        } catch (Exception e) {
            log.severe("Failed to add product: " + e.getMessage());
        }
    }
}

