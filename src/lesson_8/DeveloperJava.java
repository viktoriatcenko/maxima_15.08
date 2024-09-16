package lesson_8;

public class DeveloperJava implements Developer {

    @Override
    public void developIDE() {
        System.out.println("Intellij");
    }

    @Override
    public int countOdCodeStrings() {
        return 500;
    }

    @Override
    public void walk() {
        System.out.println("Гибкий график");
    }

    @Override
    public void earn() {
        System.out.println("150,000 ru получаю");
    }
}
