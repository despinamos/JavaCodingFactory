package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Scanner Demo. Reads two integers from the
 * std input (keyboard) and calculates result
 */
public class ScannerAddApp {
    public static void main(String[] args) {

        // Declaration and Initialization
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        //print result
        System.out.printf("The sum of %d and %d is equal to %d", num1, num2, sum);

    }
}