package ex_30__Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab230_AL_iteration {

    static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Abhinandan Basu");
        myList.add("Amit");
        myList.add("Shrayashi Ghosh");

        System.out.println("--To print ArrayList 1--");

        for (String str : myList)
        {
            System.out.println(str);
        }

        System.out.println("--To print ArrayList 2--");

        //Iterator
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("--To print ArrayList 3--");

        for(int i =0;i< myList.size();i++)
        {
            System.out.println(myList.get(i));
        }
    }

}
