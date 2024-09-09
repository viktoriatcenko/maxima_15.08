package lesson_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Комментарий к уроку

        /**
         Арифметические операторы
         +	Складывает значения по обе стороны от оператора
         -	Вычитает правый операнд из левого операнда
         *	Умножает значения по обе стороны от оператора
         /	Оператор деления делит левый операнд на правый операнд
         %	Делит левый операнд на правый операнд и возвращает остаток
         ++	Инкремент - увеличивает значение операнда на 1 х++ постфиксная, ++х префиксная
         --	Декремент - уменьшает значение операнда на 1	х-- постфиксная, --х префиксная
         * */

//        int ost = 8 % 3; // 3 + 3 + 2
//        int ost = 10 % 3; // 3 + 3 + 3 + 1
//        System.out.println(ost);


//        int a = 1;
//        int res = a + 1; // a + 1 ==== a++
//        int res1 = a++;
//        int res2 = ++a;
//        a++;
//        a++;

//        System.out.println(res1);
//        System.out.println(res2);
//        System.out.println(a);


//        int a = 10;
//
//
//        System.out.println(--a);

        /**
         Операторы сравнения

         ==	Проверяет, равны или нет значения двух операндов, если да,
         то условие становится истинным	(A == B) – не верны

         !=	Проверяет, равны или нет значения двух операндов,
         если значения не равны, то условие становится истинным	(A != B) – значение истинна

         >	Проверяет, является ли значение левого операнда больше,
         чем значение правого операнда, если да, то условие становится истинным	(A > B) – не верны

         <	Проверяет, является ли значение левого операнда меньше,
         чем значение правого операнда, если да, то условие становится истинным	(A < B) – значение истинна

         >=	Проверяет, является ли значение левого операнда больше или равно значению правого операнда,
         если да, то условие становится истинным	(A >= B) – значение не верны

         <=	Проверяет, если значение левого операнда меньше или равно значению правого операнда,
         если да, то условие становится истинным	(A <= B) – значение истинна
         * */

//        int a = 10;
//        int b = 10;
//
//        boolean isOneEqualsTwo = a <= b;
//
//        System.out.println(isOneEqualsTwo);


        /**
         Логические операторы

         &&	Называется логический оператор «И». Если оба операнда являются не равны нулю, то условие становится истинным
         ||	Называется логический оператор «ИЛИ». Если любой из двух операндов не равен нулю, то условие становится истинным
         !	Называется логический оператор «НЕ». Использование меняет логическое состояние своего операнда.
         Если условие имеет значение true, то оператор логического «НЕ» будет делать false
         * */

//        boolean isIWillGoToWalking;
//
//        int temperature = 15;
//        boolean isWeekEnd = true;
//
//        isIWillGoToWalking = isWeekEnd || temperature >= 25;
//
//        System.out.println(isIWillGoToWalking);

//        boolean c = 250 > 1000;
//
//        System.out.println(!c);

//        if (условие) {
////действие(-я), которые выполняются, если условие истинно;
//        }
//        else if (условие) {
////действие(-я), которые выполняются, если условие истинно;
//        }
//        else if (условие) {
////действие(-я), которые выполняются, если условие истинно;
//        }
//        else {
////действие(-я), которые выполняются, если условие истинно;
//        }

//        boolean isIWillGoToWalking;
//
//        int temperature = 15;
//        boolean isWeekEnd = false;
//
//        isIWillGoToWalking = isWeekEnd || temperature >= 25;
//
//        if (isIWillGoToWalking) {
//            System.out.println("Я сегодня пойду гулять");
//        } else {
//            System.out.println("О нет, сегодня не получится пойти гулять");
//        }
//
//
//        int dayOfWeek = 15;
//
//        if (dayOfWeek == 1) {
//            System.out.println("Сегодня пн");
//        } else if (dayOfWeek == 2) {
//            System.out.println("Сегодня вт");
//        } else if (dayOfWeek == 3) {
//            System.out.println("Сегодня ср");
//        } else if (dayOfWeek == 4) {
//            System.out.println("Сегодня чт");
//        } else if (dayOfWeek == 5) {
//            System.out.println("Сегодня пт");
//        } else if (dayOfWeek == 6) {
//            System.out.println("Сегодня сб");
//        } else if (dayOfWeek == 7) {
//            System.out.println("Сегодня вс");
//        } else {
//            System.out.println("Мы не знаем такого дня недели");
//        }

//        2 Напиши программу. которая будет проверять попало ли целое число, которое мы ей подадим
//        в интервал от 50 до 100 и сообщить результат на экран в следующем виде:
//        "Число number не содержится в интервале." или "Число number содержится в интервале.", где number - число, которое мы ей подадим.
//
//
//                Пример для числа 112:
//        Число 112 не содержится в интервале.
//
//        Пример для числа 60:
//        Число 60 содержится в интервале.

//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//
//        if (a <= 100 && a >= 50) {
//            System.out.println("Число " + a + " содержится в интервале.");
//        } else {
//            System.out.println("Число " + a + " не содержится в интервале.");
//        }

//        switch (ВыражениеДляВыбора) {
//            case  (Значение1):
//                Код1;
//                break;
//            case (Значение2):
//                Код2;
//                break;
//...
//            case (ЗначениеN):
//                КодN;
//                break;
//            default:
//                КодВыбораПоУмолчанию;
//                break;
//        }

        //        if (dayOfWeek == 1) {
//            System.out.println("Сегодня пн");
//        } else if (dayOfWeek == 2) {
//            System.out.println("Сегодня вт");
//        } else if (dayOfWeek == 3) {
//            System.out.println("Сегодня ср");
//        } else if (dayOfWeek == 4) {
//            System.out.println("Сегодня чт");
//        } else if (dayOfWeek == 5) {
//            System.out.println("Сегодня пт");
//        } else if (dayOfWeek == 6) {
//            System.out.println("Сегодня сб");
//        } else if (dayOfWeek == 7) {
//            System.out.println("Сегодня вс");
//        } else {
//            System.out.println("Мы не знаем такого дня недели");
//        }

        int dayOfWeek = 0;

        switch (dayOfWeek) {
            case (1) :
                System.out.println("Сегодня пн");
                break;
            case (2):
                System.out.println("Сегодня вт");
                break;
            case (3):
                System.out.println("Сегодня ср");
                break;
            case (4):
                System.out.println("Сегодня чт");
                break;
            case (5):
                System.out.println("Сегодня пт");
                break;
            case (6):
                System.out.println("Сегодня сб");
                break;
            case (7):
                System.out.println("Сегодня вс");
                break;
            default:
                System.out.println("Мы не знаем такого дня недели");
                break;
        }


    }
}
