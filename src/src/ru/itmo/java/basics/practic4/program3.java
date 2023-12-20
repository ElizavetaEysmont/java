package src.ru.itmo.java.basics.practic4;

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        sum();

    }

    public static void sum() {
        System.out.println("Ведите первое число:");
        System.out.println("Введите второе число:");
        System.out.println("Введите третье число:");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println("Ведите первое число:" + number1);
        System.out.println("Введите второе число:" + number2);
        System.out.println("Введите третье число:" + number3);

        boolean result = (number1 + number2) == number3;
        {
            System.out.println("Результат:" + result);
        }
    }

}
