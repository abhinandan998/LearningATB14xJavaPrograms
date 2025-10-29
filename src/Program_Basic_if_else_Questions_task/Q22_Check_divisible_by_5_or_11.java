package Program_Basic_if_else_Questions_task;

import java.util.Scanner;

//22)  Check if a Number is Divisible by 5 and 11
public class Q22_Check_divisible_by_5_or_11 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if(n%5 ==0 && n%11 == 0)
        {
            System.out.println(n +" is divisible by 5 and 11");
        }
        else {
            System.out.println(n+ " is not divisible by 5 and 11");
        }
    }

}
