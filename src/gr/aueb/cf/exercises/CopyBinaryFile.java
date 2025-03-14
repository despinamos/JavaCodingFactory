package gr.aueb.cf.exercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.UUID;

/**
 * copies a binary file that the user inputs the name of
 */

public class CopyBinaryFile {

    public static void main(String[] args) {
        String defaultDir = "C:/Users/Despoina/Downloads/";
        Scanner in = new Scanner(System.in);
        String fileName;
        int b;
        String[] parts;

        System.out.println("Please enter the name of the file you want to copy:");
        fileName = in.nextLine();

        String fileDirInput = defaultDir + fileName;

        String fileDirOutput = defaultDir + UUID.randomUUID().toString().replace(":", "_") + fileName;

        try (FileInputStream fileInput = new FileInputStream(fileDirInput);
        FileOutputStream fileOutput = new FileOutputStream(fileDirOutput)) {

            while((b = fileInput.read()) != -1) {
                fileOutput.write(b);
            }

            parts = fileDirOutput.split("\\.");

            System.out.println("Absolute path of initial file: " + fileDirInput);
            System.out.println("Full dir of copy created: " +fileDirOutput);
            System.out.println("The file's type is: " + parts[parts.length - 1]);
        } catch(IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
