package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueBasic {
    public static void main(String[] args) {
        Queue<Integer> q= new ArrayDeque<Integer>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.poll();
        System.out.println(q.peek());
        
    }
}
