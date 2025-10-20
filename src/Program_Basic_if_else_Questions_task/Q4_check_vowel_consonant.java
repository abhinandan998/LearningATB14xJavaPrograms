package Program_Basic_if_else_Questions_task;

import java.util.Scanner;

//4) Check if a Character is a Vowel or Consonant.
public class Q4_check_vowel_consonant {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        String str = sc.next();

        if(str.equalsIgnoreCase("A") || str.equalsIgnoreCase("E")
                || str.equalsIgnoreCase("I")|| str.equalsIgnoreCase("O")
        || str.equalsIgnoreCase("U"))
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}
