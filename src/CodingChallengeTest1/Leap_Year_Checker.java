package CodingChallengeTest1;

import java.util.Scanner;

//Write a program to check if a given year is a leap year.
//
//**Requirements:**
//- A year is leap if it's divisible by 4
//- Exception: if divisible by 100, it's not leap unless also divisible by 400
//- Use logical operators in conditions
public class Leap_Year_Checker {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int n = sc.nextInt();

        if((n%4==0  && n % 100 != 0) || (n % 400 == 0))
        {
            System.out.println(n+ " is a leap year");
        }
        else
        {
            System.out.println(n+ " is not a leap year");
        }
    }
}
