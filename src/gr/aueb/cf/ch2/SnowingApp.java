package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Snowing if raining and temp < 0
 */

public class SnowingApp {
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isSnowing = false;
        Scanner in = new Scanner(System.in);
        int temp = 0;

        System.out.println("Please insert if it is raining:");
        isRaining = in.nextBoolean();

        System.out.println("Please enter the temperature:");
        temp = in.nextInt();

        // isSnowing
        isSnowing = isRaining && (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
