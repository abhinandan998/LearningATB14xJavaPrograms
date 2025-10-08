package ex_09_switch;

import java.util.Scanner;

public class lab077_switch {
    static void main(String[] args) {

        // You need to take a user input and ask for the integer from 1 to 7.
        // And if user enters 1 to 7,
        // you will tell which day it is.
        // Logic Building Formula

        // Step 1 - Number one is using the Scanner class.
        // Step 2 number two will be basically figuring out the expression and the day.
        // Step 3- We will basically add step 3 as a rough logic.
        // Step 4 - 4 is you will write the fix the logic and optimize.
        // Step 5 - figure out the edge cases.

        //step 1
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the day 1 to 7");


            int day =sc.nextInt();
            switch (day)
            {
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("tue");
                    break;


        }


    }
}
