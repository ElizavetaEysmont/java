package src.ru.itmo.java.basics.practic5;

import java.util.Scanner;

public class method1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strArray = str.split(" ");
        System.out.println("Самое длинное слово: "+strArray[findLongestWord(strArray)]);
    }
    public static int findLongestWord(String[] strArray) {
        int maxlong = strArray[0].length();
        int index = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() > maxlong) {
                maxlong = strArray[i].length();
                index = i;
            }
        }
        return index;
    }
}
