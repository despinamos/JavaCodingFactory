package gr.aueb.cf.ch6;

/**
 * declaration and initialization of an array.
 * populate an array
 * - new
 * - unsized init
 * - array initializer
 * - print the array elements
 */

public class ArrayInit {
    public static void main(String[] args) {
        int[] arr = new int[3]; // declaration and init
        int[] arr2 = {1, 2, 3, 4, 5}; // unsized declaration
        int[] arr3;
        arr3 = new int[] {1, 2, 3, 4, 5}; // array initializer

        // Populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        // Traverse
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Enhanced for
        for (int el: arr3) {
            System.out.print( el + " ");
        }
    }
}
