package gr.aueb.cf.ch2;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Receives a user inputs of a two-digit number
 * and calculates the sum of its two digits.
 */
public class DigitSum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int firstDigit = 0;
        int lastDigit = 0;
        int sum = 0;

        System.out.println("Please enter a two-digit number:");
        inputNum = in.nextInt();

        firstDigit = inputNum / 10;
        lastDigit = inputNum % 10;
        sum = firstDigit + lastDigit;

        System.out.printf("The sum of %d and %d is %d", firstDigit, lastDigit, sum);
    }
}
