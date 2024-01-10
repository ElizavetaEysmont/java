package src.ru.itmo.java.basics.practic6;

import java.util.Scanner;

public class mainClass1 {
    public Scanner scanner;

    public mainClass1() {
        scanner = new Scanner(System.in);
    }

    public int getAge() {
        System.out.print("Введите ваш возраст: ");
        return scanner.nextInt();
    }
}

class SubClass1 extends mainClass1 {
    public SubClass1() {
        super();
    }

    @Override
    public int getAge() {
        System.out.println("Переопределенный метод для получения возраста");
        return super.getAge();
    }

    public String getName() {
        System.out.print("Введите ваше имя: ");
        return scanner.next();
    }

    public static void main(String[] args) {
        SubClass1 sub = new SubClass1();
        System.out.println("Ваш возраст: " + sub.getAge());
        System.out.println("Ваше имя: " + sub.getName());
    }
}

