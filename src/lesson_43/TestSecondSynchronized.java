package lesson_43;

import lesson_7.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestSecondSynchronized {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.work();
    }
}

class Worker {

    Cat object1 = new Cat();
    Cat object2 = new Cat();

    private Random random = new Random();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void addToList1() {
        synchronized (object1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }

    public void addToList2() {
        synchronized (object2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }


    public void addIngIntsToList() {
        for (int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }
    }

    public void work() {
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> addIngIntsToList());

        Thread thread2 = new Thread(() -> addIngIntsToList());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long after = System.currentTimeMillis();

        System.out.println("Programm took " + (after - before) + " ms");
        System.out.println("List1 is " + list1.size());
        System.out.println("List2 is " + list2.size());
    }
}


