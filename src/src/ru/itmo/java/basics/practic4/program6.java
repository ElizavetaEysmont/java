package src.ru.itmo.java.basics.practic4;

import java.util.Arrays;

public class program6 {
    public static void main(String[] args) {
        int[] array = {4, 60, 1, 17, 3};
        boolean containsOneOrThree = containsOneOrThree(array);
        if (containsOneOrThree) {
            System.out.println("Массив содержит число 1  или 3.");
        } else {
            System.out.println("Массив не содержит число 1 или 3.");
        }
    }

    public static boolean containsOneOrThree(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 || array[i] == 3) {
                return true;
            }
        }
        return false;
    }

}
