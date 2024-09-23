package lesson_9.init;

public class Test {

    private final int age = 33;

    static String log;


    private String name = "This is final";

    static {
        log = "This is the log";
    }

    {
        name = "Some Name";
    }

    public Test() {
    }

    public Test(String name) {
        this.name = name;
    }
}
