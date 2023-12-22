package src.ru.itmo.java.basics.practic4;

public class program7 {
    public static void main(String[] args) {
        int[] array = {55, 32, 98, 45, 76, 100, 33, 211, 1, 10, 27};
        boolean sorting = sorting(array);
        if (sorting) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }


    public static boolean sorting(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}


