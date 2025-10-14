package CodingChallengeTest1;

import java.util.Scanner;

//Write a program to print multiplication tables using nested loops.
//
//**Requirements:**
//- Print multiplication tables for numbers 1 to 5
//- Each table should show multiplications from 1 to 10
//- Use nested for loops
//- Format output clearly
public class Multiplication_Table {
    static void main(String[] args) {

        // Outer loop for numbers 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Multiplication Table of " + i + ":");
            System.out.println("-------------------------");

            // Inner loop for multipliers 1 to 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }

            System.out.println(); // Blank line between tables for readability
        }


    }
}
