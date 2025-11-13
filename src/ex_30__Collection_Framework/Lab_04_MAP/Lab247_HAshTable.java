package ex_30__Collection_Framework.Lab_04_MAP;

import java.util.Hashtable;

public class Lab247_HAshTable {
    static void main(String[] args) {

        //Map - Key,Value, null values allows
        //HashTable - synchronized, slow and legacy class - Thread safe
        //T1, T2 - they will use one by one

        Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(1, "one");
        ht1.put(2,"Two");
        ht1.put(3, "three");
        //        ht1.put(4, null); java.lang.NullPointerException
//        ht1.put(null, "three"); // java.lang.NullPointerException
        System.out.println(ht1);

    }
}
