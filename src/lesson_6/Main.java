package lesson_6;

public class Main {
    public static void main(String[] args) {
//        int [] arr = new int[10];

//        char ch = '!';
//        char chh = 25;

//        System.out.println(ch);
//        System.out.println(chh);

//        String s = new String();
//        s = "Hello World!";
//        char c = 72;
//        System.out.println(c);
//        c = 101;
//        System.out.println(c);
//        c = 108;
//        System.out.println(c);
//        c = 108;
//        System.out.println(c);
//
//        c = 111;
//        System.out.println(c);
//
//        System.out.println(s);
//
//        String a = "This is my first String";
//
//        System.out.println(a);
//
//        System.out.println(s.length());







        String test = "Test";

        System.out.println(test.length());

        System.out.println(test.toLowerCase());

        System.out.println(test.toUpperCase());

        byte [] arr = test.getBytes();

        for (int i = 0; i < arr.length; i++) {
            char c = (char) arr[i];
            System.out.println(c);
        }

        int index = test.indexOf("e");

        System.out.println(index);



        String email = "testmail.ru";
        String emptyMail = "";

        System.out.println(email.indexOf("@"));

        boolean isMailBoxEndsOnRu = email.endsWith("ru");

        System.out.println(isMailBoxEndsOnRu);

        System.out.println(email.startsWith("1"));

        System.out.println(email.isEmpty());

        System.out.println(emptyMail.isEmpty());




        String hello = "Hello World!";

        String [] strings = hello.split(" ");

        System.out.println(strings.length);

        hello = hello.replace("o", "ooo");

        hello = hello.replace("!", "!!!");

        System.out.println(hello);














    }
}
