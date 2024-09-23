package lesson_9.exceptions;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        System.out.println("start of program");


//        int a = 10 / 0;

        // под капотом
//        ArithmeticException arithmeticException = new ArithmeticException();
//        arithmeticException.printStackTrace();
//        System.exit(1);

//        System.out.println(a);

        String s = null;

        try {
            System.out.println(s.length());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я попытался вывести длину строки s");
        }

        System.out.println("end of program");


    }

}
