package lesson_7.model;

public class Russian extends Monkey {



    public Russian(int age, String name) {
        super(age, name);
    }

    @Override
    public void talk() {
        System.out.println("Talking by Russian");
    }

}
