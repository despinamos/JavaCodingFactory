package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int inputNum = 0;
        int tempNum = 0;

        System.out.println("Enter a positive integer");
        inputNum = in.nextInt();

        tempNum = inputNum;

        while(tempNum > 0) {
            sum += tempNum % 10;
            tempNum /= 10;
        }

        System.out.printf("The digits of number %d have a sum of %d", inputNum, sum);
    }
}
