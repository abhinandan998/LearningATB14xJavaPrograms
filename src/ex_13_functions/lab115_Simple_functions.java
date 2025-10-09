package ex_13_functions;

public class lab115_Simple_functions {
    public static void main(String[] args) {


       non_return_type_function();
       String name = return_type_function();
        System.out.println(name);



    }

    
    static void non_return_type_function()
    {
        //this is the block of code to be executed
        System.out.println("Hi there, no return type");
    }
    static String return_type_function()
    {
        System.out.println("HI, i will return");
        return "Abhi";

    }
    static boolean return_boolean()
    {
        return true;
    }
    static float return_float_pi()
    {
        return 3.14f;
    }
    static byte return_byte()
    {
        return 100;
    }
    static long return_long()
    {
        return 10L;
    }
}
