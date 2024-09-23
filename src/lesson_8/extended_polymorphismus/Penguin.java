package lesson_8.extended_polymorphismus;

public class Penguin extends Animal {


    public Penguin(String name) {
        super(name);
    }

    public void makeWarmer() {
        System.out.println("Penguin made warmer");
    }

}
