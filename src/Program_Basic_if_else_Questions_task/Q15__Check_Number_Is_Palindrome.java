package Program_Basic_if_else_Questions_task;

//15) Check if a Number is a Palindrome.
import java.util.Scanner;

public class Q15__Check_Number_Is_Palindrome {

    public static boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();

        //Two pointer approach
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            //Move left pointer to the right
            left++;
            //move righ pointer to the left
            right--;
        }
        return true;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.next();

        if(isPalindrome(s))
        {
            System.out.println(s + " is Palindrome");
        }
        else
        {
            System.out.println(s + " is not a Palindrome");
        }

    }
}


