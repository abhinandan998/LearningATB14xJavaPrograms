package CodingChallengeTest1;

import java.util.Scanner;

//Write a program to create a simple calculator using switch statement.
//
//**Requirements:**
//- Read two numbers and an operator (+, -, *, /)
//- Use switch statement to perform the operation
//- Handle division by zero
//- Display the result
public class Simple_Calculator {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Input operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;

        // Perform operation using switch
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
        }
    }
}
