package src.ru.itmo.java.basics.practic4;

public class program7 {
    public static void main(String[] args) {
        int[] ints = {55, 32, 98, 45, 76, 100, 33, 211, 1, 10, 27};

        boolean sorted = true;
        for (int i = 0; i<ints.length-1; i++){
            if (ints[i]>ints[i+1]){
                sorted = false;
                break;
            }
        }
        if (sorted){
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

}


