package ex_08_if_else;

public class lab071_If {
    static void main(String[] args) {

        String up = args[0];

        int age = Integer.parseInt(up);
        if(age>25)
        {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
