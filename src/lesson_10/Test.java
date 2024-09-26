package lesson_10;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {


        int a1 = 5;
        Integer a2 = 10;
        String s = "256";

        Integer a5 = Integer.parseInt(s);

        int a7 = 100 + a5;

        int res = Integer.max(100, 150);

        System.out.println(res);


        /**
         * 					＿java. util. Collection＿
         * java.util. Set - Все значения уникальны;		java.util. List - Могут хранится дубликаты значений;
         *
         * Нет индексов;						        Индексы есть;
         *
         * Нет порядка вхождения;					    Есть порядок вхождения;
         * */

        /**
         * * ArrayList<Integer> - это безразмерная коллекция, реализация изменяемого массива интерфейса List.
         *  * Изменяет размер динамически, но может включать в себя элементы только одного типа.
         * * Примитивные типы нельзя хранить внутри коллекций.
         *  Для этого есть ссылочные типы примитивов:
         *  int Integer
         *  byte Byte
         * short Short
         * char Character
         * */
        int [] arr = new int[10];

        ArrayList<Integer> arrayList = new ArrayList<>();

        // 1 - добавление объектов

        arrayList.add(11); // 0
        arrayList.add(22); // 1

        // 2 - добавление с индексом

        arrayList.add(1, 66);

        // 3 - замена элемента

        arrayList.set(1, 22);
        arrayList.set(2, 66);

        // 4 - посмотреть размер листа

        System.out.println(arrayList.size());

        // 5 - получение элементов

        Integer a66 = arrayList.get(2);

        System.out.println(
                a66
        );

        // 6 - преобразование коллекции в массив

        Object [] arrInt = arrayList.toArray();

        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }

        // 7 - проверка на наличие элемента в коллекции

        System.out.println(arrayList.contains(33));
        System.out.println(arrayList.contains(11));

        // 8 - добавление одной коллекции в другую

        ArrayList<Integer> arrayList1 = new ArrayList<>();

        arrayList1.add(77);

        arrayList.addAll(arrayList1);

        System.out.println(arrayList);


        // 9 - удаление элементов

        arrayList.remove(0);

        System.out.println(arrayList);

        System.out.println();

        ArrayList<String> strings = new ArrayList<>();

        strings.add("AA");
        strings.add("BB");
        strings.add("CC");

        System.out.println(strings);

        strings.remove("BB");

        // 10 - узнать индекс объекта

        System.out.println(strings.indexOf("CC"));

        // 11 - очистить коллекцию

        System.out.println(strings);

        strings.clear();

        System.out.println(strings);


        // new [10];
        ArrayList aaa = new ArrayList();

        aaa.add(11);
        aaa.add(11);
        aaa.add(11);
        aaa.add(11);
        aaa.add(11);

        System.out.println();






    }

}
