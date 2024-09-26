package lesson_11;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 50000; i++) {
            arrayList.add(i);
        }

        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 50000; i++) {
            linkedList.add(i);
        }

        Long startArr = System.currentTimeMillis();




        for (int i = 0; i < 50000; i++) {
            arrayList.add(25000, i);
        }

        Long finishArr = System.currentTimeMillis();

        System.out.println("For arrList " + (finishArr - startArr));



        Long startLinked = System.currentTimeMillis();



        for (int i = 0; i < 50000; i++) {
            linkedList.add(25000, i);
        }

        Long finishLinked = System.currentTimeMillis();

        System.out.println("For linkedList " + (finishLinked - startLinked));



    }
}
