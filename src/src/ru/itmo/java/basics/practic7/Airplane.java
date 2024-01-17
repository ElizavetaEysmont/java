package src.ru.itmo.java.basics.practic7;

public class Airplane {
    private Wing wing;
    public Airplane(){
        this.wing = new Wing();
    }
    public Wing getWing(){
        return wing;
    }
    class Wing{
        private double weight;
        void setWeight(double weight){
            this.weight = weight;
        }
        public double getWeight() {
            return weight;
        }
    }
    public static void main(String[] args){
        Airplane airplane1 = new Airplane();
        airplane1.getWing().setWeight(200);
        System.out.println("Вес крыла первого самолета: "+airplane1.getWing().getWeight());

        Airplane airplane2 = new Airplane();
        airplane2.getWing().setWeight(300);
        System.out.println("Вес крыла второго самолета: "+airplane2.getWing().getWeight());
    }
}

