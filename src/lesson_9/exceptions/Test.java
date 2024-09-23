package lesson_9.exceptions;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharik");

        Dog testDog = new Dog(null);

        try {
            dog.sayMyName();
        } catch (DogDoesNotKnownHisNameException e) {
            e.printStackTrace();
        }

        try {
            testDog.sayMyName();
        } catch (DogDoesNotKnownHisNameException e) {
            e.printStackTrace();
        }
    }
}
