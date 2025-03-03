package lesson_43;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestExecutorService {

    public static void main(String[] args) {
        // создание
        ExecutorService es = Executors.newFixedThreadPool(2);


            // передача тасок
            es.submit(new Task(1));
            es.submit(new Task(2));
            es.submit(new Task(3));
            es.submit(new Task(4));


        // окончание передачи и подготовка к запуску
        es.shutdown();

        System.out.println("All instructions are submitted");
        try {
            es.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The finish of main");

    }

}

class Task implements Runnable {

    private int id;

    public Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + id + " has completed");
    }
}
