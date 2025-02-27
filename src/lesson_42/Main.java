package lesson_42;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyFirstThread myFirstThread = new MyFirstThread();
        MySecondThread task = new MySecondThread();
        Thread mySecondThread = new Thread(task);
        Thread myThirdThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("MyThirdThread is writing " + i);
            }
        });


        myFirstThread.start();
        mySecondThread.start();
        myThirdThread.start();


        myFirstThread.join();
        mySecondThread.join();
        myThirdThread.join();

        System.out.println("End of main thread");
    }
}
