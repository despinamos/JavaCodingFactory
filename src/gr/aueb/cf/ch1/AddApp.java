package gr.aueb.cf.ch1;

/**
 * Calculates the sum of two integers
 * and the result is printed at console
 * (standard output)
 */
public class AddApp {

    public static void main(String[] args) {
        // Declaration and Initialization of Values
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        // Calculation
        result = num1 + num2;

        // Print of result
        System.out.println("Result is: " + result);
        System.out.println("Result of " + num1 + ", " + num2 + " is equal to: " + result);
        System.out.printf("Result of %d, %d is equal to: %d\n", num1, num2, result);
    }
}