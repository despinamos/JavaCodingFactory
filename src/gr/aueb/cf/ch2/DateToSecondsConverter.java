package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts days, hours, minutes and seconds
 * in total amount of seconds
 * The amount is user's input
 */

public class DateToSecondsConverter {
    public static void main(String[] args) {

        //Declaration and Initialization
        Scanner in = new Scanner(System.in);

        //magic numbers
        final int secondsPerDay = 3600 * 24;
        final int secondsPerHour = 3600;
        final int secondsPerMinute = 60;

        int totalSeconds = 0;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        System.out.println("Please enter amount of days:");
        days = in.nextInt();
        System.out.println("Please enter amount of hours:");
        hours = in.nextInt();
        System.out.println("Please enter amount of minutes:");
        minutes = in.nextInt();
        System.out.println("Please enter amount of seconds:");
        seconds = in.nextInt();

        totalSeconds = (days * secondsPerDay) + (hours * secondsPerHour) + (minutes * secondsPerMinute) + seconds;

        //Print result
        System.out.printf("The total amount of seconds of %d days, %d hours, %d minutes and %d seconds is %d", days, hours, minutes, seconds, totalSeconds);
    }
}
