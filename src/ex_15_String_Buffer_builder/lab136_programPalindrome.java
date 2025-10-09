package ex_15_String_Buffer_builder;

import java.util.Scanner;

public class lab136_programPalindrome {
    static void main() {

        //check whether it is palindrome or not in string
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        String rev = "";
        for(int i = name.length()-1;i>=0;i--)
        {
            rev=rev+name.charAt(i);
        }
        if(rev.equalsIgnoreCase(name))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}
