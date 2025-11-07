package ex_30__Collection_Framework;

import java.util.Vector;

public class Lab223_Vector {
    static void main(String[] args) {

        Vector v = new Vector();
        v.add("Abhinandan");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v);
        System.out.println(v.contains("Lucky"));
    }
}
