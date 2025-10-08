package ex_04_Operators;

import java.util.SortedMap;

public class lab039_Interview_Concat_plus {
    static void main(String[] args) {
        String  firstname ="Abhi";
        String lastname = "Basu";

        int a =10;
        int b = 20;

        System.out.println(firstname+lastname+a+b);
        System.out.println(a+b+firstname+lastname);

        System.out.println(firstname+lastname+(a+b));
    }
}
