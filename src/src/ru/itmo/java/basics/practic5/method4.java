package src.ru.itmo.java.basics.practic5;

public class method4 {
    public static int occurrences(String str1, String str2){
        int count = 0;
        int index = 0;
        while((index=str1.indexOf(str2,index)) !=-1){
            count++;
            index += str2.length();
        }
        return count;
    }
    public static void main (String[] args){
        String str1 = "Hello, word!";
        String str2 = "lo";
        int count = occurrences(str1,str2);
        System.out.println(count);
    }
}
