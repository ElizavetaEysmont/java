package src.ru.itmo.java.basics.practic6;

class MainClass {
    protected int number;

    public MainClass(int number) {
        this.number = number;
    }
}

class SubClass extends MainClass {
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

