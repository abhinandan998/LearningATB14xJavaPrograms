package ex_16_arrays;

import java.util.Scanner;

public class lab151_right_aligned_triangle {
    static void main(String[] args) {

         //  *
         // **
         //***
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n-1;j++)
            {
                System.out.print("_");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
