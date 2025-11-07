package ex_30__Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab220_List {
    static void main(String[] args) {

        List fruits = List.of("Orange", "apple","guava", "mango", "watermelon");
        System.out.println(fruits);

        List  arrayList = new ArrayList();
        arrayList.add("Abhi");
        arrayList.add(123);
        arrayList.add(true);
        arrayList.add(1.23);

        System.out.println(arrayList);

        System.out.println(arrayList.size());
    }
}
