package gr.aueb.cf.exercises;

import java.util.Scanner;

public class MaxPositionGen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        int low = 0;
        int high = 0;

        System.out.println("Please enter six integers: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for(int el : arr) {
            System.out.print(el + " ");
        }

        System.out.println(" ");

        System.out.println("Please enter limits (low and high): ");

        low = in.nextInt();
        while(low < 0) {
            System.out.println("Low must be greater than 0: ");
            low = in.nextInt();
        }

        high = in.nextInt();
        while(high > arr.length - 1) {
            System.out.println("High must be less than array length: ");
            high = in.nextInt();
        }

        System.out.println("Position of max is:" + getMaxPosition(arr, low, high));

        System.out.println("Position of second to last min element is:" + getSecondMinPosition(arr));
    }

    public static int getMaxPosition (int[] arr, int low, int high) {
        int maxPos = 0;
        int maxEl = 0;

        for (int i = low; i < high; i++) {
            if (arr[i] > maxEl) {
                maxPos = i;
                maxEl = arr[i];
            }
        }

        return maxPos + 1;
    }

    public static int getSecondMinPosition (int[] arr) {
        int secondMin = 0;
        int minPos = 0;
        int minEl = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minEl) {
                secondMin = minPos;
                minPos = i;
                minEl = arr[i];
            }

            if(arr[minPos] < arr[i] && arr[secondMin] > arr[i]) {
                secondMin = i;
            }
        }

        return secondMin + 1;
    }
}
