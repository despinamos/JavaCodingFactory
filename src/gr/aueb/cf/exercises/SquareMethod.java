package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * Uses method that returns the square of a number.
 */

public class SquareMethod {
    public static void main(String[] args) {
        int numInput = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter an integer number: ");
        numInput = in.nextInt();

        System.out.println("The square of the number is: " + square(numInput));
    }

    public static int square(int num) {
        return num * num;
    }
}
