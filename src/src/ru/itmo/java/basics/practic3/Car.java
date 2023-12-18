package src.ru.itmo.java.basics.practic3;

public class Car {
    private String color;
    private String name;
    private double weight;

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {
    }

    public String printColor() {
        return this.color;
    }

    public Double printWeight() {
        return this.weight;
    }


    public static void main(String[] args) {
        Car car1 = new Car("red");
        Car car2 = new Car("blue", 1500.5);
        System.out.println(car1.printColor());
        System.out.println(car2.printColor());
        System.out.println(car2.printWeight());
    }
}
