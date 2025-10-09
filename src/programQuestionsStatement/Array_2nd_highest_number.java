package programQuestionsStatement;

import java.util.Scanner;

// find the second maximum number in this array
//int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};// O/P → 34 ,
// don’t use sorting function.
public class Array_2nd_highest_number {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter how numbers to add: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("The numbers are: ");
        for(int i=0;i< n;i++)
        {
            arr[i]= sc.nextInt();
        }

        int largest = -1;
        int second_largest = -1;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]> largest)
            {
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i]< largest && arr[i]> second_largest)
            {
                second_largest = arr[i];
            }
        }
        System.out.println("Second latgest is : " +second_largest);

    }
}
