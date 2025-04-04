package gr.aueb.cf.ch6;

import javax.swing.text.Position;

/**
 * Array search with method.
 */

public class ArraySearchWithMethod {
    public static void main(String[] args) {

        int[] arr = {1, 2, 7, 4, 5};
        int position;

        position = getPosition(arr, 7);

        if (position == -1) {
            System.out.println("Item not found.");
        } else {
            System.out.printf("Value %d, Position: %d", arr[position], (position + 1));
        }

    }

    public static int getPosition(int[] arr, int value) {
        //if item not found
        // return non-valid value
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }

        return positionToReturn;
    }
}
