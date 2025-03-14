package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * Uses method to convert Celsius to Fahrenheit.
 */

public class CelsiusToFahrenheitMethod {
    public static void main(String[] args) {
        double temp = 0;
        double result = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter temperature in Celsius:");
        temp = in.nextDouble();

        result = celsiusToFahrenheit(temp);
        System.out.println("Temperature in Fahrenheit is: " + result);
    }

    public static double celsiusToFahrenheit(double celsTemp) {
        return celsTemp * 9/5 + 32;
    }
}
