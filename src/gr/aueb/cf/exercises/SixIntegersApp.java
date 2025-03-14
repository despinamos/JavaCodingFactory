package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * App where user enters six (1-49) integers in an array and finds:
 * > Array has no more than three even numbers.
 * > Array has no more than three odd numbers.
 * > Array has no more than three same consecutive numbers.
 * > Array has no more than three numbers with the same second digit.
 * > Array has no more than three numbers with the same first digit.
 */

public class SixIntegersApp {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter 6 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int el : arr) {
            System.out.print( el + " ");
        }

        System.out.println(" ");

        System.out.println("Has no more than 3 even numbers: " + !moreThanThreeEvens(arr));

        System.out.println("Has no more than 3 odd numbers: " + !moreThanThreeOdds(arr));

        System.out.println("Has no more than 3 consecutives: " + !moreThanThreeConsecutives(arr));

        System.out.println("Has no more than 3 with same ending: " + !moreThanThreeSameLastDigit(arr));
    }

    /**
     * Returns true if array has more than three even numbers.
     * @param arr
     * @return
     */
    public static boolean moreThanThreeEvens(int[] arr) {
        return getEvens(arr).length > 3;
    }

    /**
     * Finds how many even numbers are in an array and prints them.
     * @param arr
     * @return array with evens
     */
    public static int[] getEvens(int[] arr) {
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        int[] evens = new int[count];
        int pivot = 0;

        for (int el : arr) {
            if (el % 2 == 0) {
                evens[pivot++] = el;
            }
        }
        return evens;
    }

    public static boolean moreThanThreeOdds(int[] arr) {
        return getOdds(arr).length > 3;
    }

    /**
     * Finds many odd numbers are in an array and prints them.
     * @param arr
     * @return
     */
    public static int[] getOdds(int[] arr) {
        int count = 0;

        for(int el : arr) {
            if (el % 2 != 0) count++;
        }

        int[] odds = new int[count];
        int pivot = 0;

        for (int el : arr) {
            if (el % 2 != 0) {
                odds[pivot++] = el;
            }
        }

        return odds;
    }

    public static boolean moreThanThreeConsecutives(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 3; i++) {
            if (arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] - 2 && arr[i] == arr[i+3] -3) {
                count++;
                break;
            }
        }
        return count >= 1;
    }

    public static boolean moreThanThreeSameLastDigit(int[] arr) {
        int[] endings = new int[10];
        boolean isSameEnding = false;

        for (int num : arr) {
            endings[num % 10]++;
        }

        for (int count : endings) {
            if (count >= 3) {
                isSameEnding = true;
                break;
            }
        }
        return isSameEnding;
    }

//    public static boolean moreThanThreeSameFirstDigit(int[] arr) {
//
//    }
}
