package src.ru.itmo.java.basics.practic6;

public class mainClass {
    protected int number;

    public mainClass(int number) {
        this.number = number;
    }
}

class SubClass extends mainClass {
    public SubClass(int number) {
        super(number);
    }

    public void printNumberFromMain() {
        System.out.println("Переменная из главного класса: " + number);
    }

    public static void main(String[] args) {
        SubClass sub = new SubClass(10);
        sub.printNumberFromMain();
    }
}

