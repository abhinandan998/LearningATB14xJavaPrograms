package ex_16_arrays;

import java.util.Scanner;

public class lab149_right_triangle {
    static void main(String[] args) {

         //*
        //**
        //***

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n for the pattern: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
