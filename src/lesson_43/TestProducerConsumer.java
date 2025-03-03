package lesson_43;

import java.util.LinkedList;
import java.util.Queue;

public class TestProducerConsumer {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Thread thread1 = new Thread(() -> pc.produce());
        Thread thread2 = new Thread(() -> pc.consume());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ProducerConsumer {
    private Queue<Integer> queue = new LinkedList<>();
    private Object lock = new Object();
    private int LIMIT = 10;

    public void produce () {
        int value = 0;

        while (true) {
            synchronized (lock) {
                while (queue.size() == LIMIT) {
                    try {
                        lock.wait(); // монитор отдай, а сам спи
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                queue.offer(value++);
                lock.notify();
            }
        }

    }

    public void consume ()  {
        while (true) {
            synchronized (lock) {
                while (queue.size() == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                Integer poll = queue.poll();
                System.out.println(poll);
                System.out.println("Queue size is " + queue.size());
                lock.notify();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
