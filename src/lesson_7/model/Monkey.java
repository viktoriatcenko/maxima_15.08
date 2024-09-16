package lesson_7.model;

public abstract class Monkey {

    // fields
    int age;
    String name;

    // constructor


    public Monkey() {
    }

    public Monkey(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // methods

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

    public abstract void talk();


}
