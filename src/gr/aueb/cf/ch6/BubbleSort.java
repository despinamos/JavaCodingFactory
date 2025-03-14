package gr.aueb.cf.ch6;

/**
 * Runs Bubble Sort algorithm
 * to sort an array.
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr_test = {12,87,1, 12, 100};
        Bubblesort(arr_test);
        for(int el : arr_test) System.out.print( el + " ");
    }



    public static int[] Bubblesort (int[] arr){

        for (int i = arr.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }

    public static void swap (int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}