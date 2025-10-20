package Program_Basic_if_else_Questions_task;


import java.util.Scanner;

//2)Check if a Number is Even or Odd.
public class Q2__Check_Even_odd {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if(n%2==0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
