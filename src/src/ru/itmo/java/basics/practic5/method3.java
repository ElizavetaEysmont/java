package src.ru.itmo.java.basics.practic5;

import java.util.Scanner;

public class method3 {
    public static String censorWord(String text){
        return text.replace("бяка","вырезанно цензурой");
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String censorText = censorWord(text);
        System.out.println(censorText);
    }
}
