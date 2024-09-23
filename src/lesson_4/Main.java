package lesson_4;

import lesson_10.model.Cat;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!" + 1);
//        System.out.println("Hello world!" + 2);
//        System.out.println("Hello world!" + 3);
//        System.out.println("Hello world!" + 4);
//        System.out.println("Hello world!" + 5);

        int a = 10;

        // Циклы
        // For i
        // While
        // For each


//        for ( int i = 0 ; i < 5 ; i++ )
//        {
//            System.out.println(i);
//        }
//
//        System.out.println("Мы находимся вне цикла");

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

//        for (int i = 0; i <= 20; i++) {
//            System.out.println(i);
//        }

//        for (int i = 10; i <= 30; i++) {
//            System.out.println(i);
//        }

//        boolean isOdd = 12 % 2 == 0;
//        System.out.println(isOdd);

//        for (int i = 0; i <= 20; i++)
//        {
//            if (i % 2 == 0 && i != 0) {
//                System.out.println(i);
//            }
//        }

//        for (int i = 10; i <= 45; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println(i);
//            }
//        }

        // 10   15xxxx20            40

//        for (int i = 10; i <= 40 ; i++) {
//            // 10
//            if (i < 15 || i > 20) {
//                System.out.println(i);
//            }
//        }

//        int counter = 0;
//
//        for (int i = 10; i <= 20 ; i++)
//        {
//            counter = counter + i;
//        }
//
//        System.out.println(counter);

        // 10                     50

//        int counter = 0;
//
//        for (int i = 10; i <= 50 ; i++) {
//
//            if (i % 2 == 0) {
//                counter = counter + i;
//            }
//
//        }
//        System.out.println(counter);

//        while (true) {
//            System.out.println("Hello!");
//        }

        int counter = 10;

        while (counter > 0) {
            System.out.println(counter);
            counter--; // counter = counter - 1

            if (counter == 5) {
                break;
            }
        }


        Cat cat = Cat.getSingleCat();
        cat.setAge(12);
        cat.setName("Sherlock");
        System.out.println(cat.getName());
        System.out.println(cat.getAge());

        cat.setAge(250);

        Cat cat2  = Cat.getSingleCat();
        System.out.println(cat2.getName());
        System.out.println(cat2.getAge());

        System.out.println(cat.equals(cat2));

        System.out.println(cat == cat2);

    }
}
