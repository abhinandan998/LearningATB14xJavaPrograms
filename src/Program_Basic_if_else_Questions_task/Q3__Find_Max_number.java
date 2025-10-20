package Program_Basic_if_else_Questions_task;

import java.util.Scanner;

//3) Find the Maximum of Two Numbers.
public class Q3__Find_Max_number {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = 0;
        if(a > b)
        {
            max = a;
        }
        else
        {
            max = b;
        }
        System.out.println("Max of the two number is : " + max);
    }
}
