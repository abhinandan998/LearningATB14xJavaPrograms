package Program_Basic_if_else_Questions_task;

import java.util.Scanner;

//Q7_Smallest_of_2_numbers
public class Q7__Smallest_of_2_numbers {

    static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st no: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no: ");
        int b = sc.nextInt();


        if(a<b)
        {
            System.out.println(a+ " is smallest");
        }
        else
        {
            System.out.println(b+ " is smallest");
        }
    }
}
