package src.ru.itmo.java.basics.practic6;

import java.util.Scanner;
class MainClass1 {
    public int getAge(Scanner scanner) {
        System.out.println("Введите возраст: ");
        return scanner.nextInt();
    }
}

class SubClass1 extends MainClass1 {
    public String getUserName() {
        return "Егор";
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SubClass1 child = new SubClass1();
        int age = child.getAge(scanner);

        System.out.println("Возраст: " + age);
        System.out.println("Имя: " + child.getUserName());

        scanner.close();
    }
}


