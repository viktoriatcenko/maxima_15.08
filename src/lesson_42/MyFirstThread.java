package lesson_42;

public class MyFirstThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyFirstThread is writing " + i);
        }
    }
}
