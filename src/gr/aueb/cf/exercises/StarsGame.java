package gr.aueb.cf.exercises;

import java.util.Scanner;

public class StarsGame {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int num = 0;
        int choice = 0;

        do{

            printMenu();
            choice = checkChoice();

            switch (choice) {
                case 1:
                    num = checkInputNum();

                    horizontal(num);
                    break;

                case 2:
                    num = checkInputNum();

                    vertical(num);
                    break;

                case 3:
                    num = checkInputNum();

//                    for (int i = 1; i <= num; i++) {
//                        for (int j = 1; j < num; j++) {
//                            System.out.print("*");
//                        }
//                        System.out.println("*");
//                    }
                    starsNxN(num);
                    break;
                case 4:
                    num = checkInputNum();

//                    int n = 1;
//                    for (int i = 1; i <= num; i++) {
//                        for (int j = 1; j <= n; j++) {
//                            System.out.print("*");
//                        }
//                        n++;
//                        System.out.println("");
//                    }
                    stars1toN(num);
                    break;
                case 5:
                    num = checkInputNum();

//                    n = num;
//                    for (int i = 1; i <= num; i++) {
//                        for (int j = 1; j <= i; j++) {
//                            System.out.print("*");
//                        }
//                        n--;
//                        System.out.println("");
//                    }
                    starsNto1(num);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Something went wrong...");
                    break;
            }
        }while(choice != 6);
    }

    /**
     * Prints menu of options for star print styles.
     */
    public static void printMenu() {
        System.out.println("Please choose one of the following:");
        System.out.println("1: Print n horizontal stars");
        System.out.println("2: Print n vertical stars");
        System.out.println("3: Print nxn stars");
        System.out.println("4: Print 1 to n stars");
        System.out.println("5: Print n to 1 stars");
        System.out.println("6: Exit star game");
    }

    /**
     * Checks if the user's choice is valid.
     * @return the user's choice.
     */
    public static int checkChoice() {
        int choice = 0;
        choice = in.nextInt();
        while (choice<1 || choice > 6) {
            System.out.println("Choice must be 1-6");
            choice = in.nextInt();
        }

        return choice;
    }

    /**
     * Checks if the user's input is valid.
     * @return returns the input after it has been checked.
     */
    public static int checkInputNum() {
        int num = 0;

        System.out.println("Please enter a positive integer");
        num = in.nextInt();

        while (num < 0) {
            System.out.println("Integer must be positive:");
            num = in.nextInt();
        }

        return num;
    }

    /**
     * Prints a certain amount of horizontal stars.
     * @param number the number of stars the user wants to print.
     */
    public static void  horizontal(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    /**
     * Prints a certain amount of vertical stars.
     * @param number the number of stars the user wants to print.
     */
    public static void vertical(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println("*");
        }
    }

    /**
     * Prints nxn stars.
     * @param number n.
     */
    public static void starsNxN(int number) {
        for (int i = 1; i <= number; i++) {
            horizontal(number);
        }
    }

    /**
     * Prints 1 to n stars.
     * @param number n.
     */
    public static void stars1toN(int number) {
        for(int i = 1; i <= number; i++) {
            horizontal(i);
        }
    }

    /**
     * Prints n to 1 star.
     * @param number n.
     */
    public static void starsNto1(int number) {
        for(int i = number; i>=1; i--) {
            horizontal(i);
        }
    }
}
