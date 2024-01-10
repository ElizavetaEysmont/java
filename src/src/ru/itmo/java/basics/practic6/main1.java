package src.ru.itmo.java.basics.practic6;
public class main1 {
    public static void main (String[] args){
        car truck = new truck(2000,"Volvo",'B',80,12,10000);
        truck.outPut();
    }
}

class car {
    public int weight;
    public String model;
    public char color;
    public float speed;


    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
    }

    public car(int w, String m, char c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }

    public car() {}
}

class truck extends car {
    private int wheels;
    private int newWeight;
    public truck(int w, String m, char c, float s, int wheels, int newWeight) {
        super(w, m, c, s);
        this.wheels = wheels;
        this.newWeight = newWeight;
    }

    public void newWheels (int newWheels){
        this.wheels = newWheels;
        System.out.println("Новое колличество колёс: " + this.wheels);
    }
}
