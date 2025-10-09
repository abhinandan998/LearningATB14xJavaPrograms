package programQuestionsStatement;

import java.util.Scanner;
import java.util.SortedMap;

//Count the Number of Words in a String.
public class Count_Words {
    static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        //using split function
        String[] arr = str.split(" ");
        int count1 = arr.length;

        System.out.println("Number of words using split function: " +count1);

       //using loop
        int count= 1;

        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i)==' ') && (str.charAt(i+1)!= ' '))
            {
                count++;
            }
        }
        System.out.println("Number of words using loop: "+ count);



    }
}
