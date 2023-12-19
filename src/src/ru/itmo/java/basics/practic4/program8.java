package src.ru.itmo.java.basics.practic4;

import java.util.Arrays;
import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);{
            Scanner input = new Scanner(System.in);
            System.out.println("Array lenght: ");
            int size = input.nextInt();
            int array [] = new int[size];
            System.out.println("Number of array: ");
            for (int i = 0; i<size; i++){
                array[i]=input.nextInt();
            }

            System.out.println("Result: "+ Arrays.toString(array));

        }
    }
}