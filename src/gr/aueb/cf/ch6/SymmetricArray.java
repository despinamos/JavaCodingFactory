package gr.aueb.cf.ch6;

public class SymmetricArray {
    public static void main(String[] args) {
        int arr[] = {6, 5, 4, 5, 6};

        System.out.println("Array is symmetric: " + isSymmetricArray(arr));
        System.out.println("Array is symmetric: " + isArraySymmetric(arr));
    }

    public static boolean isSymmetricArray(int[] arr) {
        boolean isSymmetric = true;
        if (arr == null) return true; // consider null array symmetric

        for(int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }

    public static boolean isArraySymmetric(int[] arr) {
        boolean isSymmetric = true;
        int n = arr.length - 1;

        for(int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1]) {
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }

}

