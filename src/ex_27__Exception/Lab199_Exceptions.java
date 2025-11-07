package ex_27__Exception;

public class Lab199_Exceptions {
    static void main(String[] args) {
        System.out.println("Start the program");

        String ip = args[0]; //java.lang.ArrayIndexOutOfBoundException
        int a = Integer.parseInt(ip); //java.lang.NumberFormatException
        int  b = 100/a; //java.lang.ArithmeticException
        System.out.println(b);

        System.out.println("End the program");
    }
}
