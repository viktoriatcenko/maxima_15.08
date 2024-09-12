package lesson_5;

public class Factorial {
    public static void main(String[] args) {
//        int factorialOf3 = getFactorialOf3(3);
//
//        System.out.println(factorialOf3);

        System.out.println(getFactorial(3));

        System.out.println(checkNumber777(777));


    }

    public static int getFactorialOf3(int x) {


               //3      2         1
        int a1 = x * (x - 1) * (x - 2); // x -3    x - 4

        return a1;
    }

    public static int getFactorial(int x) {
        if (x == 1) {
            return 1;
        }
        System.out.println("Start of method");
        System.out.println("Current value of x = " + x);
        int result = x * getFactorial(x - 1);
        System.out.println("Before return value of result is " + result);
        return result;
    }







    public static String checkNumber777(int a) {
        if (a == 777) {
            return "OK";
        }

        return "Not Ok";
    }

}
