package src.ru.itmo.java.basics.practic5;

import java.util.Scanner;

public class method1 {
    public static String  findLongestWord (String text){
        String[] words = text.split("\\s+");
        String longestWord = "";
        for (String word: words){
            if (word.length()>longestWord.length()){
                longestWord=word;
            }
        }
        return longestWord;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String longestWord = findLongestWord(text);
        System.out.println("Самое длинное слово в тексте:" + longestWord);

    }

}
