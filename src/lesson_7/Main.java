package lesson_7;

public class Main {

    public static void main(String[] args) {
//

//        Flat modernFlat = new Flat(180);
//
//        System.out.println(modernFlat.getSquare());
//
//
//        Flat dreamFlat = new Flat(200, 50000, "Kazan");
//
//        System.out.println(dreamFlat.getCost());
//        System.out.println(dreamFlat.getSquare());
//        System.out.println(dreamFlat.getDistrict());
//
//
//        Flat namedFlat  = new Flat(180, 50000, "Leninskiy", "Penthouse");
//
//        System.out.println(namedFlat.getSquare());
//        System.out.println(namedFlat.getDistrict());
//        System.out.println(namedFlat.getCost());
//        System.out.println(namedFlat.getName());


        lesson_6.Cat cat = new lesson_6.Cat();


        Cat noNameCat = new Cat();

        noNameCat.meowNonStatic();




        Cat sherlock = new Cat("Sherlock");

        Cat streetCat = new Cat(5);

        Cat begemot = new Cat(500, "Behemoth");

        System.out.println(streetCat.getAge());

        System.out.println(sherlock.getName());

        begemot.setAge(700);

        Cat.countOfLives = 5;

        Cat.meow();
    }

    public void hello() {
        System.out.println("Hello!");
    }

    // 3! = 3 * 2 * 1 = 6




}
