package hometasks.homesem3.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
     *    Получить наименования товаров заданного сорта с наименьшей ценой.
     */
    public static void main(String[] args) {
        List<ProductCountry> products = GetProducts();
        List<String> supplies = GetSupplies(products);
        String sortProduct = "1 сорт";

        System.out.println(GetMinPriceProducts(products, supplies, sortProduct).toString());
    }

    public static List<ProductCountry> GetProducts(){
        List<ProductCountry> productsCountry = new ArrayList<>();
        productsCountry.add(new ProductCountry("Алжир", "Картофель", 563, 63, "1 сорт"));
        productsCountry.add(new ProductCountry("Алжир", "Картофель", 200, 43, "2 сорт"));
        productsCountry.add(new ProductCountry("Алжир", "Огурцы", 200, 43, "1 сорт"));
        productsCountry.add(new ProductCountry("Алжир", "Огурцы", 150, 41, "2 сорт"));
        productsCountry.add(new ProductCountry("Алжир", "Томаты", 200, 43, "1 сорт"));
        productsCountry.add(new ProductCountry("Алжир", "Томаты", 130, 43, "2 сорт"));
        productsCountry.add(new ProductCountry("Россия", "Картофель", 180, 132,"1 сорт"));
        productsCountry.add(new ProductCountry("Россия", "Картофель", 80, 32,"2 сорт"));
        productsCountry.add(new ProductCountry("Россия", "Огурцы", 82, 32,"1 сорт"));
        productsCountry.add(new ProductCountry("Россия", "Огурцы", 80, 342,"2 сорт"));
        productsCountry.add(new ProductCountry("Россия", "Томаты",50, 55,"1 сорт"));
        productsCountry.add(new ProductCountry("Россия", "Томаты",40, 65,"2 сорт"));
        productsCountry.add(new ProductCountry("Китай", "Картофель",120, 123,"1 сорт"));
        productsCountry.add(new ProductCountry("Китай", "Картофель",110, 12,"2 сорт"));
        productsCountry.add(new ProductCountry("Китай", "Огурцы",123, 1263,"1 сорт"));
        productsCountry.add(new ProductCountry("Китай", "Огурцы",120, 123,"2 сорт"));
        productsCountry.add(new ProductCountry("Китай","Томаты", 130, 54, "1 сорт"));
        productsCountry.add(new ProductCountry("Китай","Томаты", 110, 514, "2 сорт"));
        productsCountry.add(new ProductCountry("Индия", "Картофель", 78, 111,"1 сорт"));
        productsCountry.add(new ProductCountry("Индия", "Картофель", 77, 101,"2 сорт"));
        productsCountry.add(new ProductCountry("Индия", "Огурцы", 790, 101,"1 сорт"));
        productsCountry.add(new ProductCountry("Индия", "Огурцы", 73, 11,"2 сорт"));
        productsCountry.add(new ProductCountry("Индия", "Томаты", 86, 101,"1 сорт"));
        productsCountry.add(new ProductCountry("Индия", "Томаты", 78, 1001,"2 сорт"));
        return productsCountry;
    }
    public static List<String> GetSupplies(List<ProductCountry> products){
        List<String> supplies = new ArrayList<>();
        for (ProductCountry pr : products){
            if (!supplies.contains(pr.name)) supplies.add(pr.name);
        }
        return supplies;
    }

    public  static ProductCountry GetMinPrice(List<ProductCountry> products, String supply) {
        List<ProductCountry> listProducts = new ArrayList<>();
        for (ProductCountry pr : products) {
            if (pr.name.contains(supply)) {
                listProducts.add(pr);
            }
        }
        int minPrice = listProducts.get(0).price;
        int minIndxPrice = 0;
        for (int i = 1; i < listProducts.size(); i++) {
            if (minPrice > listProducts.get(i).price) {
                minPrice = listProducts.get(i).price;
                minIndxPrice = i;
            }
        }
        return listProducts.get(minIndxPrice);
    }

    public static List<ProductCountry> GetMinPriceProducts(List<ProductCountry> products, List<String> supplies, String sortProduct){
        List<ProductCountry> minPriceProducts = new ArrayList<>();
        List<ProductCountry> productsSort = new ArrayList<>();
        for (ProductCountry pr : products){
            if (pr.sort.contains(sortProduct)) productsSort.add(pr);
        }

        for (String supply : supplies){
            minPriceProducts.add(GetMinPrice(productsSort, supply));
        }
        return minPriceProducts;
    }

}
