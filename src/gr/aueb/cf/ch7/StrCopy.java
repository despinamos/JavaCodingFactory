package gr.aueb.cf.ch7;

/**
 * Strings are immutable and don't
 * affect the reference copy.
 * The copy is valid just by reference copying.
 */

public class StrCopy {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = s1;

    }
}
