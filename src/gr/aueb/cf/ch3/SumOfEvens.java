package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the sum of
 * even numbers until a limit
 * that the user enters.
 */

public class SumOfEvens {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int sum = 0;
        int i = 2;

        System.out.println("Please insert upper limit: ");
        inputNum = in.nextInt();

        // sum

        while(i <= inputNum){
            sum += i;
            i += 2;
        }

        System.out.println("The sum of input numbers up to " + inputNum + " is: " + sum);
    }
}
