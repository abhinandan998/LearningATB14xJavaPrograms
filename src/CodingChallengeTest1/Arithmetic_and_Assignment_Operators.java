package CodingChallengeTest1;

//Create a Java program that demonstrates various arithmetic and assignment operators.
//
//**Requirements:**
//- Use +, -, *, /, % operators
//- Demonstrate assignment operators (=, +=, -=, *=, /=)
//- Show the results of each operation
public class Arithmetic_and_Assignment_Operators {
    static void main(String[] args) {

        // Arithmetic Operators
        int a = 10;
        int b = 3;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division (integer division)
        System.out.println("a % b = " + (a % b)); // Modulus (remainder)

        System.out.println("\nAssignment Operators:");
        int x = 5;
        System.out.println("Initial x = " + x);

        x += 3; // equivalent to x = x + 3
        System.out.println("x += 3 → " + x);

        x -= 2; // equivalent to x = x - 2
        System.out.println("x -= 2 → " + x);

        x *= 4; // equivalent to x = x * 4
        System.out.println("x *= 4 → " + x);

        x /= 3; // equivalent to x = x / 3
        System.out.println("x /= 3 → " + x);
    }
}
