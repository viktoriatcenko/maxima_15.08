package lesson_16.model;

import lesson_7.Cat;
import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws ClassNotFoundException {


        Cat kotik = new Cat();
        kotik.setName("Kotik");

        // 1
        Class class1 = Cat.class;

        // 2
        Class class2 = Class.forName("lesson_7.Cat");

        // 3
        Class class3 = kotik.getClass();


        Method[] methods = class1.getMethods();

        Field[] declaredFields = class1.getDeclaredFields();

//        Arrays.stream(methods).forEach(System.out::println);

//        Arrays.stream(declaredFields).forEach(System.out::println);

        logger.info(kotik.getName());


        System.out.println();
    }
}
