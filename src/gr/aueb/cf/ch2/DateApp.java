package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Shows the date in DD/MM/YY format.
 */
public class DateApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("Enter day:");
        day = in.nextInt();
        if((day<1) || (day > 31)) {
            System.out.println("Wrong input, enter day again:");
            day = in.nextInt();
        }
        System.out.println("Enter month:");
        month = in.nextInt();
        if((month<1) || (month > 12)) {
            System.out.println("Wrong input, enter month again:");
            month = in.nextInt();
        }
        System.out.println("Enter year:");
        year = in.nextInt();

        System.out.printf("The date is %02d/%02d/%02d", day, month, year%100);
    }
}
