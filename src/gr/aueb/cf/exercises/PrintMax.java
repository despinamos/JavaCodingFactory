package gr.aueb.cf.exercises;

import java.util.Scanner;

public class PrintMax {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter three integers: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        System.out.println("Max number is: " + findMax(a, b, c));
    }

    public static int findMax(int a, int b, int c) {
        int temp = 0;

        if(a > b)
            temp = a;
        else
            temp = b;

        if(temp > c)
            return temp;
        else
            return c;
    }
}
