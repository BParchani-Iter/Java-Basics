package java8andlombok;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class LombokTest {
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Laptop");
        p1.setPrice(1200.0);
        p1.setCategory("Electronics");

        Product p2 = new Product();
        p2.setId(2);
        p2.setName("Phone");
        p2.setPrice(800.0);
        p2.setCategory("Electronics");

        // Test ProductService logging
        List<Product> productList = new ArrayList<>();
        ProductService service = new ProductService();
        service.addProduct(p1, productList);
        service.addProduct(p2, productList);

        // Build an Order using @Builder
        Order order = Order.builder()
                .orderId("ORD123")
                .products(Arrays.asList(p1, p2))
                .totalAmount(p1.getPrice() + p2.getPrice())
                .orderDate(LocalDate.now())
                .build();

        System.out.println("Order: " + order);

        // Test Configuration immutability
        Configuration config = new Configuration("MyApp", "1.0", "Production");
        System.out.println("Configuration: " + config);

        // Verify Lombok-generated methods
        System.out.println("Order equals itself? " + order.equals(order));
        System.out.println("Product hashCode: " + p1.hashCode());
        System.out.println("Product toString: " + p1);
    }
}
