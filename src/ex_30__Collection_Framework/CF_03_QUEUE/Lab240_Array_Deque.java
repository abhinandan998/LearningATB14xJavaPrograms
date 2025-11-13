package ex_30__Collection_Framework.CF_03_QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab240_Array_Deque {
    static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(3);
        deque.push(1);
        System.out.println(deque);
    }
}
