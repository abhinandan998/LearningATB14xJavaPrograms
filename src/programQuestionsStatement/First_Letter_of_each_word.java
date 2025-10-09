package programQuestionsStatement;


import java.util.Scanner;

//write a program to print First Letter of Each Word in a String.
public class First_Letter_of_each_word {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        boolean b = true;
        String res ="";

        //traverse the string
        for(int i =0;i<str.length();i++)
        {
            //if it has space then set b to true
            if(str.charAt(i)==' ')
            {
                b = true;
            }
            // else check if v is true or not
            //if true, copy character in output string and set b as false
            else if ((str.charAt(i)!=' ') && b == true)
            {
                res = res + str.charAt(i);
                b= false;

            }
        }
        System.out.println(res);

    }
}
