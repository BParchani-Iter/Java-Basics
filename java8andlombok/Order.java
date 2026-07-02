package java8andlombok;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class Order {
    private String orderId;
    private List<Product> products;
    private double totalAmount;
    private LocalDate orderDate;
}
