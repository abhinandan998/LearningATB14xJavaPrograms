package ex_30__Collection_Framework.CF_02_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab236_SET {
    static void main(String[] args) {

        Set hs = new HashSet(); //hashing mechanism ?

        hs.add("Abhinandan");
        hs.add("Basu");
        hs.add("dramod");
        System.out.println(hs);

        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();


    }
}
