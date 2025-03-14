package gr.aueb.cf.exercises;

import java.util.Scanner;

public class ExceptionsExerciseOne {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        try {
            choice = getChoice();

            if (choice < 1 || choice > 5) {
                throw new IllegalArgumentException("value must be 1-5");
            }
        } catch(IllegalArgumentException e) {
            System.out.println("argument < 1 or argument > 5");
        }
    }

    public static void printMenu() {
        System.out.println("Please choose one of the following:");
        System.out.println("1: Print n horizontal stars");
        System.out.println("2: Print n vertical stars");
        System.out.println("3: Print nxn stars");
        System.out.println("4: Print 1 to n stars");
        System.out.println("5: Exit");
    }

    public static int getChoice() {
        System.out.println("Please enter an int 1-4, 5 for Exit: ");
        return in.nextInt();
    }
}
