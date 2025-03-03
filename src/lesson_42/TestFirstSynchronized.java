package lesson_42;

public class TestFirstSynchronized {

    private int counter;

    public static void main(String[] args) {
        TestFirstSynchronized test = new TestFirstSynchronized();
        test.doWork();
    }

    // 0 -> 1 -> 1
    // 0 -> 1 -> 1
    public void doWork() {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });


        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter);


    }

    private void increment() {
        synchronized (this) {
            counter++; // counter = counter + 1
        }
    }

}
