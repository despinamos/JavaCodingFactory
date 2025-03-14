package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * App that uses the Caesar cryptographic method.
 * User enters a string and chooses the key with which
 * it encrypts it. The string is encrypted and then decrypted
 * using the same key.
 */

public class CaesarApp {

    static StringBuilder encrypted = new StringBuilder();
    static StringBuilder decrypted = new StringBuilder();
    public static final String alpha = "abcdefghijklmnopqrstuvwxuz";

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String toEncrypt = "";
        String encrypted = "";
        String decrypted = "";
        int key = 0;

        System.out.println("Please enter the line you would like to encrypt.");
        toEncrypt = in.nextLine();

        System.out.println("Please enter the encryption key. (Must be 1-25");
        key = in.nextInt();
        while(key < 1 || key > 25) {
            System.out.println("Key must be 1-25.");
            key = in.nextInt();
        }

        encrypted = String.valueOf(cryptoCaesar(toEncrypt, key));

        System.out.println("Encrypted phrase is: " + encrypted);

        decrypted = String.valueOf(decryptoCaesar(encrypted, key));

        System.out.println("Decrypted phrase is: " + decrypted);


    }

    public static StringBuilder cryptoCaesar(String s, int key) {
        int charPosition = 0;
        int newVal = 0;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                encrypted.append(s.charAt(i));
            } else {
                charPosition = alpha.indexOf(s.charAt(i));
                newVal = (key + charPosition) % 26;
                encrypted.append(alpha.charAt(newVal));
            }
        }

        return encrypted;

    }

    public static StringBuilder decryptoCaesar(String s, int key) {
        int charPosition = 0;
        int newVal = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                decrypted.append(s.charAt(i));
            } else {
                charPosition = alpha.indexOf(s.charAt(i));
                newVal = (charPosition - key) % 26;
                decrypted.append(alpha.charAt(newVal));
            }
        }

        return decrypted;
    }
    
}
