package javaOOPSCodingChallengeTest2;

//Create a BankAccount class with private balance field.
// Implement deposit(), withdraw(), and getBalance() methods with proper validation.
//Input:
//Initial balance: 1000, deposit: 500, withdraw: 200
//Output:
//Balance after deposit: 1500.0 Balance after withdrawal: 1300.0
public class Q4__Bank_Account_Encapsulation {

    static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(200);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}
class BankAccount
{
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        if(amount>0)
            balance+=amount;
        else
            System.out.println("Deposit amount must be positive.");
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdraw amount must be positive.");
        }
    }
    public double getBalance() {
        return balance;
    }
}
