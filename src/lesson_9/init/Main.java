package lesson_9.init;

public class Main {

    static int a = 5;

    static {
        a = 10;
    }

    public static void main(String[] args) {
        a = 5;

        Test test = new Test();
    }


}
