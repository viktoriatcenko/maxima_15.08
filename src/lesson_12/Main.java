package lesson_12;

import lesson_12.model.Coin;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("AAA");
        hashSet.add("BBB");
        hashSet.add("CCC");
        hashSet.add("AAA");


        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("AAA");
        linkedHashSet.add("BBB");
        linkedHashSet.add("CCC");
        linkedHashSet.add("AAA");

        Coin coin = new Coin();



        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer1, Integer integer2) {
                return integer2 - integer1;
            }
        });

        TreeSet<Integer> treeSetWithLambda = new TreeSet<>(
            (Integer integer1, Integer integer2) -> {
                return integer2 - integer1;
            }
        );

        TreeSet<Integer> treeSetWithLambda1 = new TreeSet<>((Integer o1, Integer o2) -> o2 - o1);

        TreeSet<Integer> treeSetWithLambda2 = new TreeSet<>((o1, o2) -> o2 - o1);

        TreeSet<Integer> treeSetTest = new TreeSet<>((o1, o2) -> o2 - o1);

        treeSet.add(851);
        treeSet.add(123);
        treeSet.add(123);
        treeSet.add(58);
        treeSet.add(85);
        treeSet.add(751);


        System.out.println();


        Coin coin1 = new Coin(10, 1.5, "Russia", 1000);
        Coin coin2 = new Coin(2, 1.3, "Belarus", 2000);
        Coin coin3 = new Coin(1, 1.9, "UK", 500);
        Coin coin4 = new Coin(5, 2.1, "Italy", 619);
        Coin coin5 = new Coin(10, 1.5, "Russia", 1500);
        Coin coin6 = new Coin(3, 1.8, "Sweden", 3000);

        TreeSet<Coin> coins = new TreeSet<>();

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);
    }
}
