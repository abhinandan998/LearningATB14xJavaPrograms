package CodingChallengeTest1;

import java.util.Scanner;

//Create a program to print various star patterns using nested loops.
//
//**Requirements:**
//- Print a right triangle pattern of stars
//- Print a pyramid pattern of stars
//- Use nested loops for pattern generation
//- Make patterns scalable based on input size
public class Star_Pattern_Printing {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of rows for the patterns: ");
        int n = sc.nextInt();

        System.out.println("\nRight Triangle Pattern:");
        System.out.println("-----------------------");

        // RIGHT TRIANGLE pattern
        for (int i = 1; i <= n; i++) {       // Outer loop for rows
            for (int j = 1; j <= i; j++) {   // Inner loop for stars
                System.out.print("* ");
            }
            System.out.println(); // Move to next line
        }

        System.out.println("\nPyramid Pattern:");
        System.out.println("----------------");

        // PYRAMID pattern
        for (int i = 1; i <= n; i++) {              // Outer loop for rows
            for (int space = i; space < n; space++) // Print leading spaces
                System.out.print(" ");
            for (int star = 1; star <= (2 * i - 1); star++) // Print stars
                System.out.print("*");
            System.out.println(); // Move to next line
        }
    }
}
