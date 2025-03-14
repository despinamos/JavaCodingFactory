package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * User enters a year and it calculates
 * if it is a leap year or not.
 */

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        System.out.println("Please enter a year:");
        year = in.nextInt();

        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0)) {
            System.out.printf("The year %d is a leap year", year);
        } else {
            System.out.printf("The year %d is not a leap year", year);
        }
    }
}
