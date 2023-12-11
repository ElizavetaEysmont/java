package src.ru.itmo.java.basics.practic1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Я");
            System.out.println("хорошо");
            System.out.println("знаю");
            System.out.println("Java");
        }

        {
            byte a = 46;
            byte b = 10;
            byte c = 3;
            int result1 = a + b;
            float result2 = ((float) b / c);
            float result = result1 * result2;
            System.out.println(result);
        }


        {
            byte d = 29;
            byte e = 4;
            byte f = -15;
            int result3 = d * e;
            int result4 = result3 * f;
            System.out.println(result4);
        }

        {
            short number = 10500;
            byte a = 10;
            int result1 = number/a;
            int result = result1/a;
            System.out.println(result);
        }

        {
            float a = 3.6f;
            float b = 4.1f;
            float c = 5.9f;
            float result = a*b*c;
            System.out.println(result);
        }
        {

            System.out.println("Введите целое число:");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            System.out.println(number);
            System.out.println(number1);
            System.out.println(number2);

        }

        {
            System.out.println("Введите целое число:");
            Scanner scanner = new Scanner(System.in);
            int b = scanner.nextInt();
            if (b % 2 != 0) {
                System.out.println("Нечетное");
            } else if (b<= 100) {
                System.out.println("Чётное");
            } else {
                System.out.println("Выход за пределы диапазона");
            }
        }
    }
}
