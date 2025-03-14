package gr.aueb.cf.exercises2025.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Check with RegEx if given password has:
 * - at least 8 characters
 * - at least one lower case letter
 * - at least one upper case letter
 * - at least one digit
 * - at least one special character.
 */

public class PasswordValidation {
    public static void main(String[] args) {
        String password = "eAis56#FK"; // valid password
        String password2 = "abc"; // non valid password
        String password3 = "andrfbid56A"; // non valid password
        String password4 = "amxAk#7"; // non valid password
        String password5 = "kAlsn&34";

        // Assert valid pattern
        Pattern pattern = Pattern.compile("^(?=.+?[a-z])(?=.+?[A-Z])(?=.+?[0-9])(?=.*?[!@#$%^&*()]).{8,}$");
        Matcher matcher = pattern.matcher(password5);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
