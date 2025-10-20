package Program_Basic_if_else_Questions_task;


import java.util.Scanner;

//5) Check if a Person is Eligible to Vote (Age Check).
public class Q5_Check_Eligible_to_vote {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        if(age>=18)
        {
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not eligible to vote");
        }
    }
}
