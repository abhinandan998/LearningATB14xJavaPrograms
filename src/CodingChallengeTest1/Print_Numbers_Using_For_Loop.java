package CodingChallengeTest1;

import java.util.Scanner;

//Write a program to print numbers from 1 to N using a for loop.
//
//**Requirements:**
//- Read the value of N from user input
//- Use for loop to print numbers from 1 to N
//- Print numbers in a single line separated by spaces
public class Print_Numbers_Using_For_Loop {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++)
        {
            System.out.print(" "+ i);
        }

    }
}
