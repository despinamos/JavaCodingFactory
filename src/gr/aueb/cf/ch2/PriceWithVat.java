package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculate the price with vat 24%.
 */
public class PriceWithVat {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final double VAT_RATE = 0.24;
        double price = 0.0;
        double priceWithVat = 0.0;
        double vat = 0.0;

        System.out.println("Please enter the price: ");
        price = in.nextDouble();
        vat = price * VAT_RATE;
        priceWithVat = price + vat;

        System.out.printf("Initial price: %.2f, Vat: %.2f, Final price: %.2f", price, vat, priceWithVat);


    }
}
