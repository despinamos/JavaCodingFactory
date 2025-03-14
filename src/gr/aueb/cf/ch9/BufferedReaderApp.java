package gr.aueb.cf.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Copy line-by-line to a new file.
 */

public class BufferedReaderApp {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        try(BufferedReader bf = new BufferedReader(new FileReader("C:/Users/Despoina/Downloads/bf-read.txt"))) {
            String line = "";

            while((line = bf.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(stringBuilder);
    }
}
