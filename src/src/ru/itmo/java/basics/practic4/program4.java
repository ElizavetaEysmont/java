package src.ru.itmo.java.basics.practic4;

import java.util.Scanner;

public class program4 {
    public static void main(String[] args){
        print3numbers();
    }
    public static void print3numbers(){
        System.out.println("Ведите первое число:");
        System.out.println("Введите второе число:");
        System.out.println("Введите третье число:");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println("Ведите первое число:"+number1);
        System.out.println("Введите второе число:"+number2);
        System.out.println("Введите третье число:"+number3);

        boolean result = (number2>number1) && (number3>number2);
        System.out.println("Результат:"+result);
    }
}
