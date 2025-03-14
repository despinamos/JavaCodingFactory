package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts euro to USD and cents
 * 99 cents = 1 euro
 */
public class EuroUSDConverter {
    public static void main(String[] args) {

        int amountEuro = 0;
        int totalUsaCents = 0;
        int resultCents = 0;
        int resultUSD = 0;
        final int parity = 99;
        Scanner in = new Scanner(System.in);

        System.out.println("Please give the amount in euro");
        amountEuro = in.nextInt();

        totalUsaCents = amountEuro * parity;
        resultUSD = totalUsaCents/100;
        resultCents = totalUsaCents % 100;

        System.out.printf("The amount of %d euros is %d dollars and %d cents", amountEuro, resultUSD, resultCents);
    }
}
