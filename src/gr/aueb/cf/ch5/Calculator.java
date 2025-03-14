package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Shows a menu of calculation choices.
 * User chooses.
 * According to this choice, the
 * respective calculation occurs.
 * Result is printed.
 * App runs until user chooses 'Exit'.
 */

public class Calculator {

    //Global scanner variable, all methods have access to it
    //Must be static, because all methods are static
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int result = 0;

        while(true) {
            printMenu();
            choice = getOneInt();

            if(!isChoiceValid(choice)) {
                System.out.println("Wrong input. Choose again.");
                continue;
            }

            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }

            result = getResultOnChoice(choice);
            System.out.println("Result: " +result);
        }
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 6;
    }

    public static void printMenu() {
        System.out.println("Choose one of the following:");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("6. Exit");
    }

    public static int getOneInt() {
        return scanner.nextInt();
    }

    public static int getResultOnChoice(int choice) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please enter two integers:");
        num1 = getOneInt();
        num2 = getOneInt();

        switch (choice) {
            case 1:
                System.out.println("Addition:");
                result = add(num1, num2);
                break;
            case 2:
                System.out.println("Subtraction:");
                result = sub(num1, num2);
                break;
            case 3:
                System.out.println("Multiplication:");
                result = mul(num1, num2);
                break;
            case 4:
                System.out.println("Division:");
                result = div(num1, num2);
                break;
            case 5:
                System.out.println("Modulo:");
                result = mod(num1, num2);
                break;
            case 6:
                System.out.println("Exit.");
                break;
            default:
                System.out.println("Wrong input");
                break;
        }

        return result;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        if(num2 == 0) return 0;
        return num1 / num2;
    }

    public static int mod(int num1, int num2) {
        if(num2 == 0) return 0;
        return num1 % num2;
    }
}