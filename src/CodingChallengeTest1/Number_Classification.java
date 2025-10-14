package CodingChallengeTest1;

import java.util.Scanner;

//Write a program to check if a number is positive, negative, or zero.
//
//**Requirements:**
//- Read an integer from user input
//- Use if-else statements to classify the number
//- Print appropriate message for each case
public class Number_Classification {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if(n>0)
        {
            System.out.println(n+ " is positive" );

        } else if (n<0) {
            System.out.println(n +" is negative" );

        }else
        {
            System.out.println(n+ " is zero" );
        }
    }
}
