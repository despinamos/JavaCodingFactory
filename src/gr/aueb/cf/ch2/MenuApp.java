package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * This is a simple menu app.
 * Loop stops when user inputs number 5.
 */

public class MenuApp {
    public static void main(String[] args) {

        int choice = 0;
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("What would you like to do?\n 1-Input \n 2-Delete \n 3-Update \n 4-Search \n 5-Exit");
            choice = in.nextInt();
            if ((choice < 1) || (choice > 5)) {
                System.out.println("Wrong input, please enter again:");
                choice = in.nextInt();
            }
        } while(choice != 5);
        System.out.println("Thanks for using the Menu App.");
    }
}
