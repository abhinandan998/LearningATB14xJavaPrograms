package CodingChallengeTest1;

//Create a program that demonstrates pre-increment, post-increment, pre-decrement, and post-decrement operators.
//
//**Requirements:**
//- Show the difference between ++i and i++
//- Show the difference between --i and i--
//- Print values before and after operations
public class Increment_and_Decrement_Operators {
    static void main(String[] args) {
        int i = 5;

        System.out.println("Initial value of i: " + i);

        // Pre-increment: ++i
        System.out.println("\nPre-increment (++i):");
        System.out.println("Value before operation: " + i);
        System.out.println("Using ++i: " + (++i)); // increments first, then uses value
        System.out.println("Value after operation: " + i);

        // Post-increment: i++
        i = 5; // reset
        System.out.println("\nPost-increment (i++):");
        System.out.println("Value before operation: " + i);
        System.out.println("Using i++: " + (i++)); // uses value first, then increments
        System.out.println("Value after operation: " + i);

        // Pre-decrement: --i
        i = 5; // reset
        System.out.println("\nPre-decrement (--i):");
        System.out.println("Value before operation: " + i);
        System.out.println("Using --i: " + (--i)); // decrements first, then uses value
        System.out.println("Value after operation: " + i);

        // Post-decrement: i--
        i = 5; // reset
        System.out.println("\nPost-decrement (i--):");
        System.out.println("Value before operation: " + i);
        System.out.println("Using i--: " + (i--)); // uses value first, then decrements
        System.out.println("Value after operation: " + i);

    }
}
