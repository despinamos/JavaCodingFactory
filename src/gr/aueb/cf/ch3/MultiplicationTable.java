package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Gives as an output the multiplication
 * of an integer that the user enters with
 * integers 1 - 10.
 */

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int i = 1;

        System.out.println("Enter an integer: ");
        num = in.nextInt();

        while (i <= 10) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
            i++;
        }


    }
}
