package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NumDenominator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert numerator: (Quit with numerator = 0)");
            numerator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("Numerator is zero. Quitting....");
                break;
            }

            System.out.println("Please insert denominator:");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Denominator must not be 0");
                continue;
            }

            result = numerator / denominator;
            System.out.println("Result " + result);
        }
    }
}
