package src.ru.itmo.java.basics.practic4;

import java.util.Arrays;

public class program6 {
    public static void main(String[] args) {
        array();
    }

    public static void array() {
        int[] ints = new int[5];
        ints[0] = 4;
        ints[1] = 60;
        ints[2] = 1;
        ints[3] = 17;
        ints[4] = 3;
        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
        int i = Arrays.binarySearch(ints, 1);
        int y = Arrays.binarySearch(ints, 3);
        System.out.println(i);
        System.out.println(y);

    }
}
