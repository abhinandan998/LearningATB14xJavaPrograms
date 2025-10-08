package ex_11_while_loop;

import java.util.Scanner;

public class lab108_while_interview {
    static void main(String[] args) {

        //factorial no

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        int fact =1;
        if(n==0){
            fact=1;
            System.out.println("fact = 1");
        }
        if(n<0 || n> Integer.MAX_VALUE)
        {
            System.out.println("out of bound");
        }
        int i=1;
        while (i<=n)
        {
            fact=fact*i;
            i++;
        }
        System.out.println(fact);
    }
}
