package ex_08_if_else;

public class lab070_If {
    static void main(String[] args) {

        String up = args[0];

        int age = Integer.parseInt(up);
        if(age>18)
        {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
