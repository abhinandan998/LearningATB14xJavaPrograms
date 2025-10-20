package Program_Basic_if_else_Questions_task;

import java.util.Scanner;

//11) Check if a Character is an Alphabet.
public class Q11__Check_Character_is_alphabet {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char  ch = sc.next().charAt(0);

        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.println(ch + " is a alphabet");
        }
        else
        {
            System.out.println(ch + " is not a alphabet");
        }


    }
}
