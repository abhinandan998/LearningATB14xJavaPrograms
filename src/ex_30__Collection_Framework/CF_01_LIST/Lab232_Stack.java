package ex_30__Collection_Framework.CF_01_LIST;

import java.util.Stack;

public class Lab232_Stack {
    static void main(String[] args) {

        Stack s = new Stack();//LIFO
        s.add("Abhinandan");
        s.add("Basu");
        s.add("Pramod");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.add("Mimi"));
        System.out.println(s);
        s.add("Chetan");
        s.add("Jitesh");
        s.push("Vijay");
        System.out.println(s);

        System.out.println(s.get(0));
        System.out.println(s.get(1));


    }
}
