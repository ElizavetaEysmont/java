package src.ru.itmo.java.basics.practic5;

import java.util.Scanner;

public class method3 {
    public static String censorWord(String text, String searchWord, String replaceWord){
        return text.replaceAll("(?i)" + searchWord, replaceWord);
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        System.out.println("Введите слово для замены: ");
        String searchWord = scanner.nextLine();
        System.out.println("Введите слово, на которое надо заменить: ");
        String replaceWord = scanner.nextLine();
        String censorText = censorWord(text, searchWord, replaceWord);
        System.out.println(censorText);
    }
}
