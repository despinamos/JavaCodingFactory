package gr.aueb.cf.ch6;

public class ArrayMinAndMax {
    public static void main(String[] args) {
        int[] arr = {23, 56, 34, 8, 2, 99};
        int minPos = 0;
        int maxPos = 0;
        int minPosLimited = 0;

        minPos = getMinPosition(arr);
        maxPos = getMaxPosition(arr);

        System.out.println("Min Position: " + (minPos+1) + " Max Position: " + (maxPos+1));

        minPosLimited = getMinPosition(arr, 1, 7);

        System.out.println("Min Position Limited: " + (minPosLimited + 1));
    }

    public static int getMinPosition(int[] arr) {
        if (arr == null || arr.length < 1) return -1;
        int minPosition = 0;
        int min = arr[minPosition];

        for (int i = 1; i< arr.length; i++) {
            if (arr[i] < min) {
                minPosition = i;
                min = arr[i];
            }
        }
        return minPosition;
    }

    public static int getMaxPosition(int[] arr) {
        if (arr == null || arr.length < 1) return -1;
        int maxPosition = 0;
        int max = arr[maxPosition];

        for (int i = 1; i< arr.length; i++) {
            if (arr[i] > max) {
                maxPosition = i;
                max = arr[i];
            }
        }
        return maxPosition;
    }

    /**
     * Overloaded getMinPosition.
     * @param arr
     * @param low
     * @param high
     * @return
     */
    public static int getMinPosition(int[] arr, int low, int high) {
        if (arr == null || arr.length < 1) return -1;
        if (low < 0 || high > arr.length - 1) return -1;
        if (low > high) return -1;
        int minPosition = low;
        int min = arr[low];

        for (int i = low; i <= high; i++) {
            if (arr[i] < min) {
                minPosition = i;
                min = arr[i];
            }
        }
        return minPosition;
    }
}
