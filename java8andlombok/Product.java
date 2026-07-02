package java8andlombok;

import lombok.Data;

@Data
public class Product {
    private int id;
    private String name;
    private double price;
    private String category;
}
