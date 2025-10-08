package ex_10_for_Loop;

//calculate the factoral of a number

import java.util.Scanner;

public class Task_Factorial {
    static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int fact =1;
        if(n==0){
            fact =1;
        }
        for(int i=1;i<=n;i++)
        {
            fact= fact*i;
        }
        System.out.println(fact);
    }
}
