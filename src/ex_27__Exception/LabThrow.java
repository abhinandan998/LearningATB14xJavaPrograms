package ex_27__Exception;

import java.util.Scanner;

public class LabThrow {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        if(!sc.next().equalsIgnoreCase("abhi"))
        {
            throw new ArithmeticException("HeHeHehe");
        }

        new Object();
    }
}
