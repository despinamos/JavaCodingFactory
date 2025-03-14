package gr.aueb.cf.ch6;

public class ArraysAsCollections {
    public static void main(String[] args) {
        int[] arr = {11, 21, 31, 5};
        int[] map = mapToDouble(arr);

        for (int el : map) {
            System.out.print( el + " ");
        }

        System.out.println("The sum of the array is: " + sum(arr));

        System.out.println("The average value of the array is: " + avg(arr));
    }

    // Filtering
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

    // Mapping
    public static int[] mapToDouble(int[] arr) {

        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }

        return mapped;
    }

    // Reducing
    public static int sum (int[] arr) {
        int sum = 0;

        for (int el : arr) {
            sum = sum + el;
        }
        return sum;
    }

    public static double avg(int[] arr) {

        //if one of the values is double, they all become
        //double and the result is double
        return sum(arr) / (double) arr.length;
    }

    public static boolean anyEvens(int[] arr) {
        return getEvens(arr).length != 0 ;
    }

    public static boolean moreThanTwoEvens(int[] arr) {
        return getEvens(arr).length > 2;
    }

    public static boolean moreThanTwoConsecutives(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] - 2) {
                count++;
                break;
            }
        }
        return count >= 1;
    }

    public static boolean moreThanTwoWithSameEnding(int[] arr) {
        //saves all single digit integers in
        //array and uses it to count how many
        //times each appears in the second digit
        //of the main array's values.
        int[] endings = new int[10];
        boolean isSameEnding = false;

        for(int num : arr) {
            endings[num % 10]++;
        }

        for (int count: endings) {
            if (count >= 3) {
                isSameEnding = true;
                break;
            }
        }
        return isSameEnding;
    }

    public static boolean AllAreEvens(int[] arr) {
        // return getEvens(arr).length == arr.length;

        int count = 0;

        for(int el: arr) {
            if (el % 2 == 0) count++;
        }
        return count == arr.length;
    }
}
