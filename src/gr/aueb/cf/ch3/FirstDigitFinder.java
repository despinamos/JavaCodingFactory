package gr.aueb.cf.ch3;

import java.nio.file.LinkPermission;
import java.util.Scanner;

/**
 * Finds the first left
 * digit of an integer.
 */

public class FirstDigitFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int tempNum = 0;

        System.out.println("Enter a positive number:");
        num = in.nextInt();
        tempNum = num;

        while(tempNum > 10) {
            tempNum /= 10;
        }

        System.out.printf("The first digit of number %d is: %d", num, tempNum);
    }
}
