package ex_16_arrays;

import java.util.Scanner;

public class lab152_2nd_highest_array {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int highest =0;
        int second_highest =0;

        for(int num : arr)
        {
            if(num> highest)
            {
                second_highest = highest;
                highest= num;
            }
            else if(num > second_highest && num!=highest)
            {
                second_highest = num;

            }
        }
        System.out.println("Second highest :" +second_highest);
        System.out.println(" highest :" +highest);
    }
}
