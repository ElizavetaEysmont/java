package src.ru.itmo.java.basics.practic1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            System.out.println("Я");
            System.out.println("хорошо");
            System.out.println("знаю");
            System.out.println("Java");




            byte a = 46;
            byte b = 10;
            byte c = 3;
            int result1 = a + b;
            float result2 = ((float) b / c);
            float result = result1 * result2;
            System.out.println(result);




            byte d = 29;
            byte e = 4;
            byte f = -15;
            int result3 = d * e;
            int result4 = result3 * f;
            System.out.println(result4);



            short number = 10500;
            byte h = 10;
            double result5 = (double) number / h;
            double result6 = result5 / h;
            System.out.println(result6);



            float q = 3.6f;
            float l = 4.1f;
            float k = 5.9f;
            float result7 = q * l * k;
            System.out.println(result7);




            System.out.println("Введите целое число:");
            Scanner scanner = new Scanner(System.in);
            int number7 = scanner.nextInt();
            int number8 = scanner.nextInt();
            int number9 = scanner.nextInt();
            System.out.println(number7);
            System.out.println(number8);
            System.out.println(number9);




            System.out.println("Введите целое число:");
            Scanner scanner1 = new Scanner(System.in);
            int z = scanner1.nextInt();
            if (z % 2 != 0) {
                System.out.println("Нечетное");
            } else if (z <= 100) {
                System.out.println("Чётное");
            } else {
                System.out.println("Выход за пределы диапазона");
            }

    }
}

