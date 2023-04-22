package hometasks.homesem3.Task1;

import java.util.ArrayList;
import java.util.List;

public class Product {
    String name;
    Integer price;
    String sort;

    public Product(String name, Integer price, String sort){
        this.name = name;
        this.price = price;
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name: " + name +
                ", price: " + price +
                ", sort: " + sort +
                '}';
    }

}
