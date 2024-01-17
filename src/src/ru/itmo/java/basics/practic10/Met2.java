package src.ru.itmo.java.basics.practic10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Met2 {
    public static void writeToFile (String filePath, String content){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))){
            writer.newLine();
            writer.write(content);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        writeToFile("files/text1.txt", "Текст который будет записан в файл: ");
    }
}
