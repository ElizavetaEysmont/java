package src.ru.itmo.java.basics.practic9;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task3 {
    public static void main(){
        ArrayList<Double>arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int A = 1000000;
        final int B = 100000;
        for (int i = 0; i < A; i++){
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < B; i++){
            arrayList.get((int) (Math.random()*(A-1)));
        }
        System.out.println(System.currentTimeMillis()-startTime);
        startTime = System.currentTimeMillis();
        for (int i=0; i < B; i++){
            linkedList.get((int) (Math.random() * (A-1)));
        }
        System.out.println(System.currentTimeMillis()-startTime);
    }
}
