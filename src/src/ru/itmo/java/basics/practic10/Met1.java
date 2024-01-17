package src.ru.itmo.java.basics.practic10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Met1 {
    public static List <String> readFile(String filePath){
        List<String> lines = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
            catch (IOException e){
                e.printStackTrace();
            }
        return lines;
        }
        public static void main (String[] args){
        List<String> strings = readFile("files/text1.txt");
        for (String s: strings){
            System.out.println(s);
        }
        }
    }








