package hometasks.homesem3.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    /**
     * 1. Дан массив записей: наименование товара, цена, сорт.
     *    Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
     */
    public static void main(String[] args) {
        List<Product> products = GetProducts();
        int maxPrice = 0;
        int indxProduct = 0;
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).name.toLowerCase().contains("высший") & products.get(i).price > maxPrice){
                maxPrice = products.get(i).price;
                indxProduct = i;
            }
        }

        System.out.println(products.get(indxProduct).toString());


    }
    public static List<Product> GetProducts(){
        List<Product> products = new ArrayList<>();
        products.add(new Product("Абрикос высший сорт", 100, "1 сорт"));
        products.add(new Product("Вишня", 200, "2 сорт"));
        products.add(new Product("Ананас", 80, "1 сорт"));
        products.add(new Product("Арбуз", 50, "2 сорт"));
        products.add(new Product("Высший мандарин", 120, "1 сорт"));
        products.add(new Product("Баклажан тоже высший", 10, "2 сорт"));
        products.add(new Product("Картофель", 70, "1 сорт"));

        return products;
    }
}

