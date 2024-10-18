package lesson_15;

public class Worker {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        new Worker().doWork();

    }

    public void increment() {
        synchronized (this) {
            counter++;
        }
    }

    public void doWork() throws InterruptedException {


        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
                // 100 -> 101      -> 102
                // 100 -> 102      -> 102 .. 103
                // counter = counter + 1;
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);

    }




}

