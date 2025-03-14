package gr.aueb.cf.ch5;

/**
 * Recursive calculation of Factorial.
 * Factorial of n! is 1 * 2 * 3 * 4 * ... * n
 * But it can also be calculated as:
 * n! = (n-1)! * n
 * n! = (n-2)! * (n-1) * n etc...
 */

public class FactorialRecursive {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(facto(i));
        }
    }

    public static long facto(int n) {
        //recursion must stop at 1 so
        //there is no stack overflow
        //if (n <= 1) return 1;
        //return facto(n - 1) * n;
        return (n <= 1) ? 1L : n * facto(n -1);
    }
}

