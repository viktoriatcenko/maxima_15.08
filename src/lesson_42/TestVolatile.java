package lesson_42;

import java.util.Scanner;

public class TestVolatile {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();

        thread.shutDown();
    }
}

class MyThread extends Thread {

    private volatile boolean isRunning = true;

    @Override
    public void run() {
        while (isRunning) {
            System.out.println("Hello World!");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shutDown() {
        this.isRunning = false;
    }
}
