package lesson_12;

import lesson_12.model.Coin;
import lesson_12.model.Matherial;

import java.util.HashSet;

public class TestCoin {
    public static void main(String[] args) {

        Integer a = 5;
        System.out.println("Hello!");
        String aa = "AA";
        String bb = "BB";

//        System.out.println(aa.equals(bb));


//        Coin coin = new Coin();

        Coin coin1 = new Coin(10, 1.5, "Russia", 1000, Matherial.GOLD);
        Coin coin2 = new Coin(2, 1.3, "Belarus", 2000, Matherial.GOLD);
        Coin coin3 = new Coin(1, 1.9, "UK", 500, Matherial.ARGENTHUM);
        Coin coin4 = new Coin(5, 2.1, "Italy", 619, Matherial.GOLD );
        Coin coin5 = new Coin(10, 1.5, "Russia", 1500, Matherial.ARGENTHUM);
        Coin coin6 = new Coin(3, 1.8, "Sweden", 3000, Matherial.GOLD);

        HashSet<Coin> coins = new HashSet<>();

        System.out.println(coin1);
        System.out.println(coin6);

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

        System.out.println(coin1.equals(coin6));
        System.out.println(coin1.equals("Hello"));

        System.out.println(coin1);
    }
}
