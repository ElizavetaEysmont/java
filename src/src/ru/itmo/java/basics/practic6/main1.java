package src.ru.itmo.java.basics.practic6;

public class main1 {
    public static void main(String[] args) {
        Truck truck = new Truck(2000, "Volvo", 'B', 80, 12, 10000);
        truck.outPut();
        truck.newWheels(14);
    }
}
class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;

    public void outPut () {
        System.out.println("Вес " + model + " составляет " + weight + " кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
    }

    public Car (int w, String m, char c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }

    public Car () {}
}

class Truck extends Car {
    private int numberOfWheels;
    private int maxWeight;

    public Truck(int w, String m, char c, float s, int wheels, int maxWeight) {
        super(w, m, c, s);
        this.numberOfWheels = wheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int newNumberOfWheels) {
        this.numberOfWheels = newNumberOfWheels;
        System.out.println("Новое количество колес установлено: " + this.numberOfWheels);
    }
}

