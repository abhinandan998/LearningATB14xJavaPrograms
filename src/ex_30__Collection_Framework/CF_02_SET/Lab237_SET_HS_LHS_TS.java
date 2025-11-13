package ex_30__Collection_Framework.CF_02_SET;

import java.awt.image.RasterOp;
import java.util.*;

public class Lab237_SET_HS_LHS_TS {
    static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        //Hashing mechanism to store the element, no order
        //no duplicates

        hs.add("Apple");
        hs.add("orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
        //hs.add(123);
        hs.add(null);
        System.out.println(hs);

        System.out.println("------------------------------");
        Set lhs = new LinkedHashSet();
        //LinkedHashSet mechanism to store the element,
        //order will maintain, no duplicates

        lhs.add("Opple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("watermelon");
        lhs.add("watermelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println("----------------------------");

        Set ts = new TreeSet();
        //Black and white mechanism to store the element
        //natural sorting order is maintained
         ts.add("Dapple");
         ts.add("Apple");
         ts.add("Orange");
         ts.add("watermelon");
         ts.add("watermelon");

        // ts.add(123); //java.lang.classCastException
       // ts.add(null);//java.lang.NullPointerException

        System.out.println(ts);
    }
}
