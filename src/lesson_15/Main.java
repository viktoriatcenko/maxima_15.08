package lesson_15;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("It's start of main");

        MyFirstThread thread1 = new MyFirstThread();
        thread1.start();


        Thread thread2 = new Thread(new MySecondThread());
        thread2.start();


        thread1.join();
        thread2.join();



        System.out.println("It's end of main");
    }
}

class MySecondThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MySecondThread " + i);
        }
    }
}

class MyFirstThread extends Thread {

    // сама функциональность реализации действий потока
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyFirstThread " + i);
        }
    }
}
