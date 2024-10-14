package lesson_13;

import lesson_7.model.Animal;
import lesson_8.model.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<? super Integer> integerBox = new Box<>(42);

        System.out.println(integerBox.getItem());

        List<? super Integer> list1 = new ArrayList<Integer>();
        List<? super Integer> list2 = new ArrayList<Number>();
        List<? super Integer> list3 = new ArrayList<Object>();

//        list1.add(25);
//        list2.add(5);
//        list3.add(new Character('2'));

//        Box<String> stringBox = new Box<>("Hello World!");

//        System.out.println(stringBox.getItem());

//        List<? super lesson_7.model.Cat> list = new ArrayList<>();
//        lesson_7.model.Animal animal = new Animal();
//        list.add(animal);


    }
}
