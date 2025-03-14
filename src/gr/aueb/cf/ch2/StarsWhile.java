package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Print a certain amount of
 * horizontal stars.
 */

public class StarsWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int i = 1;

        System.out.println("How many stars to print?");
        num = in.nextInt();

        while(i<=num){
            System.out.print("*");
            i++;
        }

        int j = 10;
        while(j>=1) {
            System.out.print("*");
            j--;
        }

    }
}
