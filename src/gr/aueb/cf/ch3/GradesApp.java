package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * User will enter:
 * - His total grades
 * - The amount of classes he takes
 *
 * The app will calculate the average grade
 * and will determine if it is Excellent ( >=9 )
 * Very Good ( >=7 ), Good ( >=5 ) and Fail ( <5 )
 */

public class GradesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalMarks = 0;
        int coursesCount = 0;
        double average = 0;

        System.out.println("Please insert total marks");
        totalMarks = scanner.nextDouble();

        if (totalMarks <= 0) {
            System.out.println("Total marks must not be negative or zero.");
            System.exit(1);
        }

        System.out.println("Please insert courses count");
        coursesCount = scanner.nextInt();

        if (coursesCount <= 0) {
            System.out.println("Courses count must not be negative or zero.");
            System.exit(1);
        }

        average = totalMarks / coursesCount;

        if (average > 10) {
            System.out.println("Error. The average must be less or equal to 10");
        }

        if (average >= 9) {
            System.out.println("Excellent: " + average);
        } else if (average >=7) {
            System.out.println("Very Good: " + average);
        } else if (average >=5) {
            System.out.println("Good: " + average);
        } else {
            System.out.println("Failure: " + average);
        }


    }
}
