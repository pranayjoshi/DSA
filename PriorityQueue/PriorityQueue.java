package PriorityQueue;

import java.util.Collection;
import java.util.Collections;

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();
        // java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<Collections.reverseOrder()>();


        pq.add(5);
        pq.add(15);
        pq.add(10);
        System.out.println(pq.size());
        while (pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
