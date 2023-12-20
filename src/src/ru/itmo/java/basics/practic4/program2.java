package src.ru.itmo.java.basics.practic4;

public class program2 {
    public static void main(String[] args){
        printOds();
    }

    public static void printOds(){
        for (int i=1;i<=100;i++){
            if (i % 3 == 0){
                System.out.println("Делится на 3:"+i);
            }
        }
        for (int i=1; i <=100; i++){
            if (i % 5 ==0){
                System.out.println("Делится на 5:"+i);
            }
        }
        for (int i=1; i<=100; i++){
            if(i%3==0 && i%5==0){
                System.out.println("Делится на 3 и на 5:"+i);
            }
        }

    }
}
