package ex_16_arrays;

import java.util.Scanner;

public class lab150_reverse_left_triangle {
    static void main(String[] args) {


         //*****
        // ****
        // ***
        // **
        // *

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i=n;i>=1;i--)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
