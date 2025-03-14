package gr.aueb.cf.ch8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleBank {

    static double balance = 500;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            deposit(100);
        } catch (Exception e) {
            System.out.println("An error happened. Try again...");
        }
    }

    public static void deposit(double amount) throws Exception{
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be positive."); //log
            }
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } catch(IllegalArgumentException e) {
            System.out.println("Error." + e.getMessage()); //log
            throw e;
        }
    }
}
