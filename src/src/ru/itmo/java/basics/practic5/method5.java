package src.ru.itmo.java.basics.practic5;

public class method5 {
    public static void main(String[] args){
        String str = "This is a test string";
        System.out.println("The given string is: "+str);
        System.out.println("The string reversed word by word is:");
        System.out.println(reverseWords(str));
    }
    public static String reverseWords(String s){
        String[] words = s.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i>=0; i--){
            reversed.append(words[i]);
            if(i != 0){
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

}
