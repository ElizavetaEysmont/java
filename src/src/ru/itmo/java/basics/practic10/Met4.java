package src.ru.itmo.java.basics.practic10;

import java.io.*;
import java.util.List;

public class Met4 {
    public static void replaceSpecialCharacters(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            int charCode;
            while ((charCode = reader.read()) != -1) {
                char character = (char) charCode;
                if (Character.isLetterOrDigit(character)) {
                    writer.write(character);
                } else {
                    writer.write('$');
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main (String[] args){
        String inputFile = "files/text.txt";
        String outputFile ="files/formet4";
        replaceSpecialCharacters(inputFile,outputFile);
    }
}



