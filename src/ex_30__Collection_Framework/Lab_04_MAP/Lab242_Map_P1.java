package ex_30__Collection_Framework.Lab_04_MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab242_Map_P1 {
    static void main(String[] args) {

        //Map m1 = new Map();
//        Map m1 = new HashMap();
//
//        m1.put("name" ,"Abhinandan");
//        m1.put("rollNo" , "Abhinandan");
//        m1.put(true, "Abhinandan");
//        m1.put(3.14, "Abhinandan");

        Map m1 = new HashMap();
        //Map is a key - value
        //name: Abhinandan
        //rollNO: 03
        //phone: 9144243431
        m1.put("name", "Abhinandan");
        m1.put("rollNO", 3);
        m1.put("phone", 914424343);
        System.out.println(m1);

        System.out.println("------------------");

        Map m2 = new LinkedHashMap();
        m2.put("name", "Abhinandan");
        m2.put("rollNO", 3);
        m2.put("phone", 914424343);
        System.out.println(m2);

        System.out.println("----------------------");

        Map m3 = new TreeMap();
        m3.put("name", "Abhinandan");
        m3.put("rollNO", 3);
        m3.put("phone", 914424343);
        System.out.println(m3);
    }
}
