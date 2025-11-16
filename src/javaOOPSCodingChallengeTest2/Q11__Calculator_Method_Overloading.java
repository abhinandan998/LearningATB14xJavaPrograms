package javaOOPSCodingChallengeTest2;

//Write a program to demonstrate method overloading by creating multiple "add" methods
// with different parameters.
//Input:
//add(5, 3), add(2.5, 3.7), add(1, 2, 3)
//Output:
//Integer addition: 8 Double addition: 6.2 Three integers addition: 6
public class Q11__Calculator_Method_Overloading {

    static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Integer addition: " + calc.add(5, 3));
        System.out.println("Double addition: " + calc.add(2.5, 3.7));
        System.out.println("Three integers addition: " + calc.add(1, 2, 3));
    }
}
class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}


