package lesson_8;

public class DeveloperHelper {


    public static void printInfoAboutDeveloper(Developer developer) {
        developer.walk();
        developer.earn();
        developer.developIDE();
        System.out.println(developer.countOdCodeStrings());
    }

}
