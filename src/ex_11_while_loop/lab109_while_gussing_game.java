package ex_11_while_loop;

import java.util.Random;
import java.util.Scanner;

public class lab109_while_gussing_game {
    static void main(String[] args) {

        //guess a number between 1 an 100
        //n=56
        //90, 60, 50 -> 50 to 60

        Random ran = new Random();
        int numToGuess = ran.nextInt(100)+1;
        //System.out.println(numToGuess);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempts =0;

        while (true)
        {
            if(!sc.hasNextInt())
            {
                System.out.println("Invalid input!");
                sc.next(); //consume invalid token
                continue;
            }

            guess = sc.nextInt();
            attempts++;

            if(guess<1 || guess>100) {
                System.out.println("Please enter a number between 1 and 100");
                continue;

            }
            if(guess<numToGuess)
            {
                System.out.println("Two low, try again");
            }else if (guess>numToGuess)
            {
                System.out.println("Too high, try again");
            }
            else {
                System.out.println("you guess it correct in " + attempts +" attempts");
                break;
            }

        }


    }
}
