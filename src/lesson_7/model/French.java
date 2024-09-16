package lesson_7.model;

public class French extends Monkey {


    public French(int age, String name) {
        super(age, name);
    }

    @Override
    public void talk() {
        System.out.println("Talking by French");
    }
}
