package CodingChallengeTest1;

import java.util.Scanner;

//Create a program to find the largest among three numbers using if-else statements.
//
//**Requirements:**
//- Read three integers from user input
//- Use nested if-else or if-else if statements
//- Handle cases where numbers might be equal
public class Find_Largest_of_Three_Numbers {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int largest;

        // Using if-else statements
        if (num1 > num2 && num1 > num3) {
            largest = num1;
            System.out.println("Largest number is: " + largest);
        } else if (num2 > num1 && num2 > num3) {
            largest = num2;
            System.out.println("Largest number is: " + largest);
        } else if (num3 > num1 && num3 > num2) {
            largest = num3;
            System.out.println("Largest number is: " + largest);
        } else {
            System.out.println("Two or more numbers are equal and largest.");
        }
    }
}
