package lesson_16.model;

import lesson_7.Cat;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Cat kotik = new Cat();

        // 1
        Class class1 = Cat.class;

        // 2
        Class class2 = Class.forName("lesson_7.Cat");

        // 3
        Class class3 = kotik.getClass();


        Method[] methods = class1.getMethods();

        Field[] declaredFields = class1.getDeclaredFields();

//        Arrays.stream(methods).forEach(System.out::println);

        Arrays.stream(declaredFields).forEach(System.out::println);


        System.out.println();
    }
}
