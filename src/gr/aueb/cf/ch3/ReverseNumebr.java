package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Reverses an integer.
 * For example: 123 -> 321.
 */

public class ReverseNumebr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int tempNum = 0;
        int reversed = 0;
        int lastdigit = 0;

        System.out.println("Enter a positive integer");
        num = in.nextInt();

        tempNum = num;

        while(tempNum > 0) {
           lastdigit = tempNum % 10;
           reversed = reversed * 10 + lastdigit;
           tempNum /= 10;
        }

        System.out.printf("The reversed number is %d", reversed);
    }
}
