package src.ru.itmo.java.basics.practic4;

import java.util.Arrays;
import java.util.Scanner;

public class program5 {
    public static void main(String[] args){
        print();
    }

    public static void print(){
        int[] array = {2,10,15,11,3};
        System.out.println("array ="+ Arrays.toString(array));
        if (array.length>=2 && array[0]==3 || array[array.length -1] == 3){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

