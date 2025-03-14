package gr.aueb.cf.ch3;

import java.util.Scanner;

public class VoteEligibile {
    public static void main(String[] args) {
        final int votingAge = 18;
        Scanner in = new Scanner(System.in);
        int ageInput = 0;
        boolean isEligible = false;

        System.out.println("Please enter your age:");
        ageInput = in.nextInt();

        //isEligible
        isEligible = ageInput >= votingAge;

        System.out.printf("Your age %d is eligible: %b", ageInput, isEligible);
    }
}
