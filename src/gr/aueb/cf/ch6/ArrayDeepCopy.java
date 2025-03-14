package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Fresh copy of array using method.
 * The method returns the place in heap
 * where the 'destination' array points at.
 * The array copy is pointing at that same
 * heap place.
 */

public class ArrayDeepCopy {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int arrCopy[];
        arrCopy = arrDeepCopy(arr);

        for (int el : arrCopy) {
            System.out.print(el + " ");
        }
    }

    public static int[] arrDeepCopy(int[] source) {
        int[] destination = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }

      // Other options
      //  System.arraycopy(source, 0, destination, 0, source.length);
      //  destination = Arrays.copyOf(source, source.length);
      //  Arrays.copyOfRange(source, 0, source.length);

        return destination;
    }
}
