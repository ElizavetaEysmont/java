package src.ru.itmo.java.basics.practic4;

import java.util.Arrays;

public class program9 {
    public static void main(String[] args){
        int [] ints = new int[4];
        ints[0] = 5;
        ints[1]=6;
        ints[2]=7;
        ints[3]=2;
        System.out.println("Array 1:"+ Arrays.toString(ints));
        int temp = ints[0];
        ints[0]=ints[3];
        ints[3]=temp;
        System.out.println("Array 2:"+Arrays.toString(ints));


    }
}
