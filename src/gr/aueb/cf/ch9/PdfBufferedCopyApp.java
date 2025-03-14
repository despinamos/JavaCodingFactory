package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Copies a pdf file as binary file
 * using 8KB buffer.
 */

public class PdfBufferedCopyApp {

    public static void main(String[] args) {
        int b;
        int counter = 0;
        long start;
        long end;
        double elapsedTime = 0.0;
        byte[] buffer = new byte[8192]; //8KB

        try (FileInputStream fis = new FileInputStream("C:/Users/Despoina/Downloads/test.pdf");
             FileOutputStream fos = new FileOutputStream("C:/Users/Despoina/Downloads/test-out-buffered.pdf")) {

            start = System.currentTimeMillis();
            while ((b = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, b);
                counter++;
            }
            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;

            System.out.printf("The file with size %.1fKB (%d bytes) was copied successfully.", (counter / 1024.0), counter);
            System.out.println("Elapsed time: " + elapsedTime + " seconds");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    }
