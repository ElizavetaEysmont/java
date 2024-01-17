package src.ru.itmo.java.basics.practic10;

import java.io.*;
import java.util.List;

public class Met3 {
    public static void mergeTextFiles(String inputFile1, String inputFile2, String mergedFile) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(inputFile1));
             BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
             BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile))) {
            String line;
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String [] args){
        String file1 = "files/text1.txt";
        String file2 = "files/text2.txt";
        String mergedFile = "files/merge.txt";
        mergeTextFiles(file1, file2, mergedFile);
    }
}
