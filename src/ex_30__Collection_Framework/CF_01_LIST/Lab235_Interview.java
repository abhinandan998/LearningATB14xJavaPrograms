package ex_30__Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Collections;

public class Lab235_Interview {
    static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        System.out.println(a1);
        Collections.sort(a1,Collections.reverseOrder());

        for (Integer o:a1)
        {
            System.out.println(6*o);
        }
    }
}
