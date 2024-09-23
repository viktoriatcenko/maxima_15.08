package lesson_10;

import lesson_10.model.Builder;
import lesson_10.model.Cat;
import lesson_10.model.Dog;
import lesson_10.model.Post;

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog("Doberman");

        Cat cat = Cat.getSingleCat();

        Post post = new Builder()
                .photo("Photo from Vacation")
                .text("Я классно отдохнул")
                .build();

        String s = "Hello!";
        String a = "Hello!";
        String w = "World!";

        String ss = a + w;

        System.out.println("My name is...");

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(a)
                .append(w)
                .append(ss)
                .append("!!!!");

        System.out.println(stringBuilder);


        Dog oldD = d.getCurrentDog().getCurrentDog().getCurrentDog();

    }
}
