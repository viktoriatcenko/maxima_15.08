package lesson_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(5);


//        System.out.println(mylist.get(3));
//
//        for (int i = 0; i < mylist.size(); i++) {
//            System.out.println(mylist.get(i));
//        }

//        for (int i = 0; i < mylist.size(); i++) {
//            if (mylist.get(i) % 2 == 0) {
//                System.out.println(mylist.get(i));
//            }
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < 5; i++) {
//            int nextInt = scanner.nextInt();
//            mylist.add(nextInt);
//        }

//        for (int i = 0; i < mylist.size(); i++) {
//            System.out.println(mylist.get(i));
//        }
//
//
//



        // 1. Создай список строк в методе main.
        //2. Добавь в него 3 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
        //3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.

        //  1 -   ТИП ДАННЫХ, который лежит в листе
        //  2 - кличка для переменной
        //  3 - наименование коллекции
//        for (Integer alias : mylist) {
//            System.out.println(alias);
//        }



//        ArrayList<String> strings = new ArrayList<>();
//
//        for (int i = 0; i < 3; i++) {
//            String s = scanner.nextLine();
//            strings.add(0, s);
//        }
//
//        for (String s : strings) {
//            System.out.println(s);
//        }


        // 5
        //1. Создай список строк.
        //2. Добавь в него 5 строк с клавиатуры.
        //3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
        //4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String s = scanner.nextLine();
            strings.add(s);
        }

        for (int i = 0; i < 13; i++) {
            int lastEl = strings.size() - 1;
            String s = strings.get(lastEl);
            strings.remove(lastEl);
            strings.add(0, s);
        }



    }
}
