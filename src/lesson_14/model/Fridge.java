package lesson_14.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fridge {

    private final Map<String , Integer> products;
    private final String nameOfFridge;

    public Fridge() {

        products = new HashMap<>();
        nameOfFridge = "LG";

    }

    public void putProducts(String product, Integer count) {

        if (products.containsKey(product)) {
            Integer oldCount = products.get(product);
            Integer newCount = oldCount + count;
            products.put(product, newCount);
        } else {
            products.put(product, count);
        }


    }


    public String getNameOfFridge() {
        return nameOfFridge;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public void checkProducts(String product, Integer count) {

        if (!products.containsKey(product)) {
            System.out.println("Такого продукта нет!");
            return;
        } else if (products.get(product) > count) {
            var currentCountOfProductOstatok = products.get(product) - count;
            products.put(product, currentCountOfProductOstatok);
            System.out.println("Вы взяли " + product + " " + count +  "шт");
            System.out.println("У вас осталось " + product + " " + currentCountOfProductOstatok +  "шт");
            return;
        } else if (products.get(product) < count) {
            System.out.println( product + " в кол-ве " + count + " отсутствует ");
            System.out.println(product + " есть в кол-ве " + products.get(product));
            giveLastProductsOrNot(product);
        } else if (products.get(product) == count) {
            System.out.println("Вы взяли " + product + " " + count +  "шт");
            products.remove(product);
        }


    }

    private void giveLastProductsOrNot(String product) {
        System.out.println("Хотите забрать все, что есть? y/n ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if ("y".equals(answer)) {
            products.remove(product);
        } else if ("n".equals(answer)) {
            System.out.println(product + " остался в кол-ве " + products.get(product));
        } else {
            System.out.println("Не понял, что вы ввели");
            System.out.println(product + " остался в кол-ве " + products.get(product));
        }
    }

    public void outProducts() {
        for (String key : products.keySet()) {
            System.out.print(key);
            Integer count = products.get(key);
            System.out.print(" - " + count + "\n");
        }
    }
}
