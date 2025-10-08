package ex_07_increment_decrement_operator;

public class lab_062_ID_op_Post {
    static void main(String[] args) {

        int a = 10;
        int b= a++;
        System.out.println(a);
        System.out.println(b);

        //ERT
        //Line no| a | b
        //6      |10 |na
        //7      |11 |10
        //8      |11 -print |10
        //9      |11 |10 -print
    }
}
