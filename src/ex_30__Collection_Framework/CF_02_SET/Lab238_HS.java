package ex_30__Collection_Framework.CF_02_SET;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab238_HS {
    static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.add(9);
        set.add(3);
        set.add(1);

        System.out.println("Set element : "+set);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
