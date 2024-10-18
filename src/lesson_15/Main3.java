package lesson_15;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        MyFirstThreadd threadd = new MyFirstThreadd();
        threadd.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        threadd.shutdown();

    }
}

class MyFirstThreadd extends Thread {

    private volatile boolean running = true;

    // сама функциональность реализации действий потока
    @Override
    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        running = false;
    }
}
