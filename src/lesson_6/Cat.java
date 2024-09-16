package lesson_6;

public class Cat {

    // Характеристики
    // Поля / fields

    protected int age;
    String name;

    void nameThisCat() {
        int a = 5;
        name = "Barsik";
    }


    public void printNameOfCat() {
        System.out.println(name);
    }

    public int countDifficultNumbers(int a, int b) {
        int result = a * b;
        return result;
    }

    public int countDifficultNumbers() {
        int result = 541 * 258;
        return result;
    }

    public void iAmHere() {
        System.out.println("I am cat and I'm here");
    }


    void sayCity(String city) {
        System.out.println("Hello, I am from " + city);
    }

    void sayLifes(int live) {
        System.out.println("I am have " + live + " lives");
    }

    int ageOfCat() {
        age = 2;
        return age;
    }


    public static void meow() {
        System.out.println("Meow!");
    }





}
