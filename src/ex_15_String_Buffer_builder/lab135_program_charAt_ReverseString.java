package ex_15_String_Buffer_builder;

import java.util.Scanner;

public class lab135_program_charAt_ReverseString {

    static void main() {
        //write a program to reverse a string without using inbuilt function

        Scanner sc = new Scanner(System.in);
        String ip =sc.next();

//        StringBuilder stringBuilder = new StringBuilder();
//        System.out.println(stringBuilder.reverse());

        String reverse_ui = "";

        for(int i= ip.length()-1; i>=0;i--)
        {
            reverse_ui = reverse_ui + ip.charAt(i);
        }
        System.out.println(reverse_ui);

    }
}
