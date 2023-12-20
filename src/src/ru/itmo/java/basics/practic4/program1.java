package src.ru.itmo.java.basics.practic4;

public class program1 {
    public static void main(String[] args){
        printOdds();
    }
    public static void printOdds() {
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}


