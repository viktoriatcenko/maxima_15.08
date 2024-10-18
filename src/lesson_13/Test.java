package lesson_13;

import lesson_12.model.Coin;
import lesson_12.model.Matherial;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Coin coin1 = new Coin(10, 1.5, "Russia", 1000, Matherial.GOLD);
        Coin coin2 = new Coin(2, 1.3, "Belarus", 2000, Matherial.GOLD);
        Coin coin3 = new Coin(1, 1.9, "UK", 500, Matherial.ARGENTHUM);
        Coin coin4 = new Coin(5, 2.1, "Italy", 619, Matherial.GOLD );
        Coin coin5 = new Coin(10, 1.5, "Russia", 1500, Matherial.ARGENTHUM);
        Coin coin6 = new Coin(3, 1.8, "Sweden", 3000, Matherial.GOLD);

        ArrayList<Coin> coins = new ArrayList<>();

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);
//
//        List<Coin> filteredList = coins.stream()
//                .filter(coin ->
//                        coin.getPrice() > 2010)
//                .toList();

        List<Coin> filteredList = coins.stream()
                .filter(coin -> {
                    System.out.println(coin.getPrice()); // need to print in console...
                    return coin.getPrice() > 2010;
                }).toList();

        List<Coin> sortedListByCountry = coins.stream()
                .sorted(Comparator.comparing(Coin::getCountry))
                .toList();

//        Coin coinn = coins.stream()
//                .max(Comparator.comparing(Coin::getDiameter)).get();

        Optional<Coin> c = coins.stream()
                        .min(Comparator.comparing(Coin::getDiameter));
        Coin coinn = c.get();
//        c.ifPresent(System.out::println);

        coins.forEach(System.out::println);

        boolean b = coins.stream()
                .anyMatch(x -> x.getNominal() == 3);

        Map<Matherial, List<Coin>> grouppedByMath = coins.stream()
                .collect(Collectors.groupingBy(Coin::getMatherial));

        List<String> list = coins.stream()
                .map(Coin::getCountry)
                .toList();




        System.out.println(b);


        System.out.println();
    }
}
