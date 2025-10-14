package CodingChallengeTest1;

//Write a program to find and print all prime numbers between 1 and 100 using loops.
//
//**Requirements:**
//- Use nested loops to check for prime numbers
//- A prime number is divisible only by 1 and itself
//- Print all prime numbers in the range 1-100
//- Optimize the algorithm for better performance
public class Prime_Number_Finder {
    static void main(String[] args) {

        System.out.println("Prime numbers between 1 and 100 are:");
        System.out.println("------------------------------------");

        // Outer loop: iterate through numbers 2 to 100
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Optimization: only check divisors up to sqrt(num)
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Not prime → stop checking further
                }
            }

            // If still prime, print it
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
