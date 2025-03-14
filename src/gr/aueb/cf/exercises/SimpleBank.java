package gr.aueb.cf.exercises;

import java.util.Scanner;

public class SimpleBank {

    static Scanner scanner = new Scanner(System.in);
    static double balance = 500;

    public static void main(String[] args) {
        while (true) {

            System.out.println("---Simple Bank Menu---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");

            try {
                int choice = scanner.nextInt();

                if (choice < 1 || choice > 4) {
                    throw new IllegalArgumentException();
                }

                switch (choice) {
                    case 1:
                        try {
                            deposit(50);
                        } catch(Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            withdraw(100);
                        } catch(Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.println("Current balance: $" + balance);
                        break;
                    case 4:
                        System.out.println("Thank you for choosing our bank!");
                        return;
                    default:
                        System.out.println("Something went wrong. Please try again.");
                        break;
                }
            } catch(IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static void deposit(double amount) throws Exception{
        try {
            if (amount <= 0) {
                throw new Exception("Error. Amount cannot be negative or zero.");
            }
            balance = balance + amount;
            System.out.println("Successfully deposited " + amount);
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage());
            throw e;
        }
    }

    public static void withdraw(double amount) throws Exception{

        try {
            if (balance <= 0) {
                throw new Exception("Error. Amount cannot be negative or zero.");
            }
            if (amount > balance) {
                throw new IllegalArgumentException("Error. Amount cannot be more than balance.");
            }
            balance = balance - amount;
        } catch(Exception e) {
            System.out.println("Error with balance.");
            throw e;
        }
    }
}
