package ex_30__Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab229_LL_List {
    static void main(String[] args) {

        List mylist = new ArrayList();
        List mylist2 = new ArrayList(10);
        List mylist3 = List.of("12","23");

        List myList = new LinkedList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        System.out.println(myList);
    }
}
