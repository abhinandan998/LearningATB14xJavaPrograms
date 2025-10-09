package programQuestionsStatement;

//Write a program that calculates and displays the letter grade for a given numerical score
// (e.g., A, B, C, D, or F) based on the following grading scale:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59

import java.util.Scanner;

public class Grade_Calculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();

        if(marks>=90 && marks<=100)
        {
            System.out.println("A");
        }
        else if (marks>=80 && marks<=89)
        {
            System.out.println("B");
        }
        else if (marks>=70 && marks<=79)
        {
            System.out.println("C");
        }
        else if (marks>=60 && marks<=69)
        {
            System.out.println("D");
        }
        else if (marks>=0 && marks<=59)
        {
            System.out.println("F");
        }
        else
        {
            System.out.println("Enter a valid marks(0-100)!");
        }

    }
}
