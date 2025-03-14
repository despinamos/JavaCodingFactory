package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * Method to check if a number is Prime or not.
 * A prime number is a number that is only divided
 * by 1 and by itself (mod = 0).
 */

public class PrimeMethod {
    public static void main(String[] args) {
        int inputNum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter an integer number: ");
        inputNum = in.nextInt();

        if(isPrime(inputNum))
            System.out.println(inputNum + " is a prime number.");
        else
            System.out.println(inputNum + " is not a prime number.");
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        else {
            for (int i = 2; i<= num/2; i++) {
                if ((num % i) == 0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}
