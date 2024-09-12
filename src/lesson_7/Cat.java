package lesson_7;

public class Cat {

    // Поля / fields
    int age;
    String name;

    static int countOfLives;

    // Конструктор / constructor

    public Cat(String name) {
        this.name = name;
    }

    public Cat(int age) {
        this.age = age;
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Cat() {

    }

    // Геттеры и сеттеры


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void meow() {
        System.out.println("Meow!");
    }
}
