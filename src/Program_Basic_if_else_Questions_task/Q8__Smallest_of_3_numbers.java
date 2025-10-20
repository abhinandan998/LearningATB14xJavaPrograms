package Program_Basic_if_else_Questions_task;

import java.util.Scanner;

//Q8_Smallest_of_3_numbers
public class Q8__Smallest_of_3_numbers {

    static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st no: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd no: ");
        int c = sc.nextInt();

        if(a<b && a<c)
        {
            System.out.println(a+ " is smallest");
        }
        else if(b<a && b<c)
        {
            System.out.println(b + " is smallest");
        }
        else
        {
            System.out.println(c+ " is smallest");
        }
    }
}
