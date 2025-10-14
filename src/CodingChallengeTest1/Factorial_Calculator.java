package CodingChallengeTest1;

import java.util.Scanner;

//Create a program to calculate factorial of a number using while loop.
//
//**Requirements:**
//- Read a positive integer from user input
//- Use while loop to calculate factorial
//- Handle edge case for 0! = 1
//- Use appropriate data type to handle large results
public class Factorial_Calculator {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");

            return;
        }

        long factorial = 1;

        int i = 1;
        while (i <= n) {
            factorial = factorial * i;
            i++;
        }


        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
