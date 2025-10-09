package ex_13_functions;

import java.util.Scanner;

public class lab117_UD_part1 {
    static void main(String[] args) {

       //user defined function
        //- 1. Without Parameters and Without Return Type
        //- 2. Without Parameters but With Return Type
        //- 3. With Parameters and Without Return Type - **main**
        //- 4. With Parameters and With Return Type.

        //1
        wop_wor_greet();
        //2
        String msg = wop_wr_greet();
        System.out.println(msg);
        //3
        greet_with_details("Abhi", 65,100);
        greet_with_details("Rahul",64, 10);

        //4.
        int res = sum_of_two_no(3,4);
        int res1 = sum_of_three_no(3,6,9);
        float res2= sum_of_three_no_float(3.14f,56.4f, 87.24f);

        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);


    }
    //- 1. Without Parameters and Without Return Type
    static void wop_wor_greet()
    {
        System.out.println("Hi, there");
    }
    //- 2. Without Parameters but With Return Type
    static String wop_wr_greet(){
        System.out.println("hi type 2");
        return  "HI how are you";
    }
    //3. With Parameters and Without Return Type - **main**
    static  void greet_with_details(String name,int  age,int salary)
    {
        System.out.println("your name -> " +name+ "\n your age ->" +age+ "\nyour salary -> "+salary);
    }
    //- 4. With Parameters and With Return Type.
    static int sum_of_two_no(int a, int b)
    {
        return a+b;
    }
    static int sum_of_three_no(int a, int b,int c)
    {
        return a+b+c;
    }
    static float sum_of_three_no_float(float a, float b,float c)
    {
        return a+b+c;
    }



}
