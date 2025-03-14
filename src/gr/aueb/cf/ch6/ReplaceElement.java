package gr.aueb.cf.ch6;

public class ReplaceElement {
    public static void main(String[] args) {

    }

    public static void replace(int [] arr, int oldVal, int newVal) {
        int positiontoUpdate;

        positiontoUpdate = getPosition(arr, oldVal);

        if (positiontoUpdate == - 1) {
            return;
        }

        arr[positiontoUpdate] = newVal;
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
