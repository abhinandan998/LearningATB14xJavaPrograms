package ex_13_functions;

import java.util.Scanner;

public class lab119_Function_Arth {
    static void main(String[] args) {
        //create a function of sub, sum, mul and div
        //with parameter a,b(from user)

        //logic building
        //step 1- inputs and outputs
        //a,b -> scanner
        //int ->> variable result ->

        //step 2- rough logic -> create functions
        //function-> type 4th -> with return and with arguments/parameter

        //step 3- > write the code and find and fix -> edge cases

        Scanner sc= new Scanner(System.in);
        int a= readInt(sc, "Enter the num 1: ");
        int b = readInt(sc , "Enter the num2: ");

        int sum = sum(a,b);
        int sub = sub(a,b);
        int muly = Mul(a,b);
        int div = div(a,b);
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(muly);
        System.out.println(div);


    }
    static int readInt(Scanner sc, String prompt)
    {
        System.out.println("Prompt");
        if(sc.hasNextInt())
        {
            return sc.nextInt();
        }
        else {
            System.out.println("Enter the int only");
            System.exit(0);
            return -1;
        }
    }
    static  int sum(int a , int b)
    {
        return a+b;
    }
    static  int sub(int a , int b)
    {
        return a-b;
    }
    static  int Mul(int a , int b)
    {
        return a*b;
    }
    static  int div(int a , int b)
    {
        return a/b;
    }

}
