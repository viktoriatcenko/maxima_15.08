package lesson_6;

public class Test {


    public static void main(String[] args) {
        int a = 5;

        Cat cat = new Cat();



        cat.nameThisCat();
        cat.printNameOfCat();
        cat.meow();

        int smartCatNumber = cat.countDifficultNumbers(258,417);

        System.out.println(smartCatNumber);

        cat.iAmHere();
        cat.sayCity("Moscow");

        cat.sayLifes(8);

        int ageCat = cat.ageOfCat();
        System.out.println(ageCat);


    }


}
