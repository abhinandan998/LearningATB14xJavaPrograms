package ex_30__Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab227_ArrayList {
    static void main(String[] args) {

        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        Collections.sort(marks, Collections.reverseOrder());
        System.out.println(marks);
    }
}
