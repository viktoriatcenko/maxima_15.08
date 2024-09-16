package lesson_8;

public class Elephant implements Animal {

    @Override
    public void walk() {
        System.out.println("Хожу на 4 ногах");
    }

    @Override
    public void breathe() {
        System.out.println("Задерживает дыхание на 120 секунд");
    }
}
