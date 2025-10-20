package Program_Basic_if_else_Questions_task;

import java.util.Scanner;

//1) Check if a Number is Positive or Negative.
public class Q1__check_positive_negative {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if(n>0)
        {
            System.out.println("Number is positive");
        }
        else if (n<0)
        {
            System.out.println("Number is negative");

        }else
        {
            System.out.println("Number is zero");
        }
    }
}
