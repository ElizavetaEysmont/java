package src.ru.itmo.java.basics.practic5;

import java.util.Scanner;

public class method2 {
    public static boolean isPalindrome (String word){
        int i = 0;
        int j = word.length()-1;
        while (i<j){
            if (word.charAt(i) != word.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        if (isPalindrome(word)){
            System.out.println(word+" это слово палиндром");}
        else {
            System.out.println(word+" это слово не палиндром");

        }
    }
}
