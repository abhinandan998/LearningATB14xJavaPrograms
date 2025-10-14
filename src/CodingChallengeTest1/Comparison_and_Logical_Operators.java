package CodingChallengeTest1;

//Write a program that demonstrates comparison and logical operators.
//
//**Requirements:**
//- Use comparison operators (==, !=, <, >, <=, >=)
//- Use logical operators (&&, ||, !)
//- Print boolean results with explanatory messages
public class Comparison_and_Logical_Operators {
    static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("Comparison Operators:");
        System.out.println("a == b: " + (a == b));   // equals
        System.out.println("a != b: " + (a != b));   // not equals
        System.out.println("a < b: " + (a < b));     // less than
        System.out.println("a > b: " + (a > b));     // greater than
        System.out.println("a <= b: " + (a <= b));   // less than or equal to
        System.out.println("a >= b: " + (a >= b));   // greater than or equal to

        System.out.println("\nLogical Operators:");
        boolean condition1 = a < b;
        boolean condition2 = a == 10;

        System.out.println("condition1 && condition2: " + (condition1 && condition2)); // AND
        System.out.println("condition1 || condition2: " + (condition1 || condition2)); // OR
        System.out.println("!condition1: " + (!condition1));                           // NOT
        System.out.println("!condition2: " + (!condition2));                           // NOT
    }
}
