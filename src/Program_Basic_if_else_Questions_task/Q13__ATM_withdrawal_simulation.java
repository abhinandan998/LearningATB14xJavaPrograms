package Program_Basic_if_else_Questions_task;

import java.util.Scanner;

//13) ATM Withdrawal Simulation. (Follow Below Steps to Write Program)
//       Steps to Write the Program
//1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
//2️⃣ Take user input for the amount they want to withdraw.
//3️⃣ Check withdrawal conditions:
//The amount should be greater than zero.
//The amount should be a multiple of 100 (common ATM rule).
//The amount should not exceed the account balance.
//4️⃣ Deduct the amount from the balance if conditions are met.
//5️⃣ Display the updated balance or an error message if the withdrawal fails.
public class Q13__ATM_withdrawal_simulation {
    static void main(String[] args) {

        int balance = 10000;

        Scanner sc = new Scanner(System.in);
        System.out.println("---- ATM Withdrawal Simulation----");
        System.out.println("Current balance is: $"+balance);
        System.out.print("Enter the amount to be withdrawal: $");
        int withdraw_amt = sc.nextInt();

        if(withdraw_amt<=0)
        {
            System.out.println("Invalid amount...The amount should be greater than zero.");
        }
        else if(withdraw_amt%100!=0)
        {
            System.out.println("Invalid amount...withdrawal amount should be a multiple of 100");
        }
        else if(withdraw_amt>balance)
        {
            System.out.println("Invalid... withdrawal amount should not exceed the account balance.");
        }
        else
        {
            balance-=withdraw_amt;
            System.out.println("----Withdrawal successful----");
            System.out.println("Amount withdraw: $"+withdraw_amt);
            System.out.println("updated balance: $"+balance);
        }
    }
}
