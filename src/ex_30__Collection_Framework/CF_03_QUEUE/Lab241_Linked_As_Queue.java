package ex_30__Collection_Framework.CF_03_QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab241_Linked_As_Queue {
    static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        queue.add(1);
        queue.add(8);

        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext())
        {
           Integer value = iterator.next();
            System.out.println(value);
        }
    }
}
