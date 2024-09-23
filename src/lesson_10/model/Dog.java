package lesson_10.model;

public class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Dog getCurrentDog() {
        Dog dog = this;
        return dog;
    }

}
