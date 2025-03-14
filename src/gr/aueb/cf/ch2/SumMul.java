package gr.aueb.cf.ch2;

import org.w3c.dom.ls.LSOutput;

/**
 * Calculate the sum and mul of
 * first 10 integers.
 */

public class SumMul {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int sum = 0;
        int mul = 1;


        while (i <= 10) {
            sum += i;
            i++;
        }

        while(j <= 10) {
            mul *= j; //mul = mul * j
            j++;
        }

        System.out.println("sum: " + sum + " mul: " + mul);
    }
}
