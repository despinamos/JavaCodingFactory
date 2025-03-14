package gr.aueb.cf.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Reg ex to match entire String and not just part of String.
 * At least 4 of any character, in parentheses it uses assert,
 * it is not consumed it means one at least should be lowercase.
 */

public class ZeroLengthAssertion {

    public static void main(String[] args) {
        String s = "BCu";

        Pattern pattern = Pattern.compile("^(?=.*[a-z]).{4,}$");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
