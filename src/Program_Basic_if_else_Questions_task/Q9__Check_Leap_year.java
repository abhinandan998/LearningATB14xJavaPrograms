package Program_Basic_if_else_Questions_task;

import java.util.Scanner;

//9) Check if a Year is a Leap Year.
public class Q9__Check_Leap_year {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if((year%4 == 0 && year %100 != 0 ) || year %400==0)
        {
            System.out.println(year +" is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
    }
}
