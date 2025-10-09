package programQuestionsStatement;

import java.util.Scanner;

//Write a program to reverse a string without using inbuilt functions.
public class ReverseString {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String rev ="";
        char[] arr = str.toCharArray();

        for (int i=arr.length-1;i>=0;i--)
        {
            rev = rev+ arr[i];
        }
        System.out.println(rev);

    }
}
