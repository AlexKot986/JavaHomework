package hometasks.homesem3.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductCountry {
    String country;
    String name;
    Integer weigh;
    Integer price;
    String sort;

    public ProductCountry(String country, String name, Integer price, Integer weigh, String sort){
        this.country = country;
        this.name = name;
        this.price = price;
        this.weigh = weigh;
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Product{" +
                "country: " + country +
                " name: " + name +
                " price: " + price +
                " weigh: " + weigh +
                " sort: " + sort +
                '}' + "\n";
    }
}
