package ex_30__Collection_Framework.Lab_04_MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab246_Map_with_ArrayList {
    static void main(String[] args) {

        HashMap<String, String > student1 = new HashMap<>();
        student1.put("name", "Abhinandan");
        student1.put("roll", "3");
        student1.put("phone", "9144243431");
        System.out.println(student1);

        HashMap<String,String> student2 = new HashMap();
        student2.put("name","amit");
        student2.put("roll","2");
        student2.put("phone","65432356");
        System.out.println(student2);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

        // List of Map
        // [{phone=9144243431, name=Abhinandan, roll=3}, {phone=65432356, name=amit, roll=2}]

        // JSON
        // [{"phone":9144243431, "name":Abhinandan, "roll":3}, {"phone":65432356, "name":amit, "roll":2}]

    }
}
