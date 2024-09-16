package lesson_8;

public class DeveloperPHP implements Developer{


    @Override
    public void developIDE() {
        System.out.println("PSIsharm");
    }

    @Override
    public int countOdCodeStrings() {
        return 1000;
    }

    @Override
    public void walk() {
        System.out.println("9-18");
    }

    @Override
    public void earn() {
        System.out.println("100.000");
    }
}
