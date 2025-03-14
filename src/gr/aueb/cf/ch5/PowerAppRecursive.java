package gr.aueb.cf.ch5;

/**
 * Recursive calculation of Power.
 * Calculated as:
 * a^n = a^(n-1) * a
 * a^n = a^(n-2) * a * a
 * a^n = a^(n-3) * a * a * a etc...
 */

public class PowerAppRecursive {
    public static void main(String[] args) {

    }

    /**
     * Recursive version of power app.
     * @param a the base.
     * @param n the power.
     * @return the base raised to the power.
     */

    public static int pow(int a, int n) {
        //recursion stops at 0 to prevent
        //stack overflow
        //if (n==0) return 1;
        //return pow(a, n-1) * a;
        return (n == 0) ? 1 : pow(a, n-1) * a;
    }
}
