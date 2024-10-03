package lesson_11;

import java.util.*;

public class Part2 {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // 1 - добавление объектов

        set.add(11);
        set.add(22);
        set.add(34);
        set.add(43);
        set.add(55);



        set.add(43);

        System.out.println();

        // 2 - добавление с индексом ------------------------

        // 3 - замена элемента --------------


        // 4 - посмотреть размер листа

        System.out.println(set.size());

        // 5 - получение элементов

//        Iterator iterator = set.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        // 7 - проверка на наличие элемента в коллекции

        if (set.contains(33)) {
            System.out.println("Yes, set has 33");
        } else {
            System.out.println("No, set has not 33");
        }

        // 8 - добавление одной коллекции в другую

        List<String> strings = new ArrayList<>();

        Set<Integer> anotherSet = new HashSet<>();

        anotherSet.add(77);
        anotherSet.add(88);
        anotherSet.add(99);

        set.addAll(anotherSet);



        // 9 - удаление элементов

        set.remove(55);

        // 11 - очистить коллекцию

        set.clear();

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
