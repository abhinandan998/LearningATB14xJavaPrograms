package programQuestionsStatement;

import java.util.Scanner;

public class palindromeCheck {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String rev ="";
        for(int i = str.length()-1;i>=0;i--)
        {
            rev=rev+ str.charAt(i);
        }
        if(rev.equalsIgnoreCase(str))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
