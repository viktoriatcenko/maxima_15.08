package lesson_9;

import lesson_8.extended_polymorphismus.Animal;
import lesson_8.extended_polymorphismus.Gepard;
import lesson_8.extended_polymorphismus.Penguin;

public class Main {


    public static void main(String[] args) {

        byte b = (byte) 129;

        System.out.println(b);


        Gepard gepard1 = new Gepard("gepard1");
        Animal gepard2 = new Gepard("gepard2");
        Penguin penguin = new Penguin("penguin1");

        someMethod(gepard1);
        someMethod(gepard2);
        someMethod(penguin);
        someMethod("Hello World!");

    }


    public static void someMethod(Object object) {

        if (object instanceof Gepard) {
            Gepard testGepard = (Gepard) object;
            testGepard.makeStronger();
        } else if (object instanceof Penguin) {
            Animal testPenguin = (Animal) object;
        } else {
            System.out.println("This is simple object");
        }

    }




}
