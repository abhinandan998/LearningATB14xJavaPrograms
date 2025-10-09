package ex_15_String_Buffer_builder;

import java.util.Scanner;

public class lab134_program_charArray {

    static void main() {
        // //write a program to reverse a string without using inbuilt function

        Scanner sc = new Scanner(System.in);
        String ip= sc.next();

        String reverse_ip = "";
        char[] arr= ip.toCharArray();

        for(int i= arr.length-1;i>=0;i--)
        {
            reverse_ip = reverse_ip + arr[i];
        }
        System.out.println(reverse_ip);
    }
}
