package lesson_8.model;

public class Dog implements Animal {

    @Override
    public void talk() {
        System.out.println("Bark!");
    }
}
