package gr.aueb.cf.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Reads from a file data like:
 * 'city, latitude, longitude'
 * separated by comma and space
 * and formats the data in json format.
 */

public class LocationFile {

    public static void main(String[] args) {

        String inFilePath = "C:/Users/Despoina/Downloads/locations.txt";
        String outFilePath = "C:/Users/Despoina/Downloads/locations-formatted.txt";
        String line;
        String[] tokens;
        String[] wordsFirstLine;


        try(BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
            PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            while((line = reader.readLine()) != null) {
                tokens = line.split(",+\\s*");
                printFormatted(ps, tokens);
                printFormatted(System.out, tokens);
            }

        } catch (IOException e) {
            System.err.println("Error." + e.getMessage());
        }
    }

    public static void printFormatted(PrintStream ps, String[] tokens) {
        ps.printf("{ \"location\": \"%s\", \"latitude\": \"%s\", \"longitude\": \"%s\", \n }", tokens[0], tokens[1], tokens[2]);
    }
}
