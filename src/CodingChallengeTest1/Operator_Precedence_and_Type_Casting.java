package CodingChallengeTest1;

//Write a program that demonstrates operator precedence and type casting in Java.
//
//**Requirements:**
//- Show operator precedence with complex expressions
//- Demonstrate implicit and explicit type casting
//- Print results with explanations
public class Operator_Precedence_and_Type_Casting {
    static void main(String[] args) {
        int intValue = 10;
        double doubleValue = 3.5;

        System.out.println("Operator Precedence Example:");

        // Complex expression demonstrating precedence
        // Multiplication (*) and division (/) have higher precedence than addition (+)
        double result1 = intValue + doubleValue * 2;
        System.out.println("intValue + doubleValue * 2 = " + result1);
        System.out.println("Explanation: Multiplication happens first: 3.5*2=7.0, then 10+7=17.0");

        double result2 = (intValue + doubleValue) * 2;
        System.out.println("(intValue + doubleValue) * 2 = " + result2);
        System.out.println("Explanation: Parentheses override precedence: 10+3.5=13.5, then *2=27.0");

        System.out.println("\nType Casting Example:");

        // Implicit Casting (widening)
        double implicitCast = intValue; // int → double automatically
        System.out.println("Implicit Casting (int → double): intValue=" + intValue + " → double=" + implicitCast);

        // Explicit Casting (narrowing)
        int explicitCast = (int) doubleValue; // double → int manually
        System.out.println("Explicit Casting (double → int): doubleValue=" + doubleValue + " → int=" + explicitCast);

        // Mixed expression with explicit casting
        int mixedResult = intValue + (int) doubleValue; // cast double to int before addition
        System.out.println("Mixed expression with explicit cast: intValue + (int)doubleValue = " + mixedResult);
        System.out.println("Explanation: 10 + 3 = 13 (doubleValue truncated to 3)");

    }
}
