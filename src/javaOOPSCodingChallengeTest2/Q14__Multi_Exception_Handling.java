package javaOOPSCodingChallengeTest2;

//Implement exception handling for a program that divides two numbers and catches
// ArithmeticException, NumberFormatException, and ArrayIndexOutOfBoundsException.
//Input:
//Division by zero, invalid number format, array index out of bounds
//Output:
//ArithmeticException: Cannot divide by zero NumberFormatException:
// Invalid number format ArrayIndexOutOfBoundsException: Array index out of bounds
public class Q14__Multi_Exception_Handling {
    static void main(String[] args) {

        int[] arr ={1,2,3};
        try
        {
            // ArithmeticException: division by zero
            int a =10;
            int b=0;
            int res = a/b;
            System.out.println("Result: " +res);
        }catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException: Cannot divide by zero");
        }

        try
        {
            // NumberFormatException: invalid number format
            String str = "abc";
            int num = Integer.parseInt(str);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format");

        }

        try
        {
            // ArrayIndexOutOfBoundsException: array index out of bounds
            int value = arr[5];
            System.out.println("Array value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
        }
    }
}
