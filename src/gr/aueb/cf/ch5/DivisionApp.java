package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Double demo.
 */

public class DivisionApp {
    public static void main(String[] args) {
        double num1 = 8.5;
        double num2 = 3.1;
        double div = 0d;
        double mod = 0.0;
        float myFloat = 4.5F; //double is 64 bit but float is 32
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter two doubles: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        div = num1 / num2;
        mod = num1 % num2;

        System.out.printf("Div: %.2f\n", div);
        System.out.printf("Mod: %.2f", mod);
    }
}
