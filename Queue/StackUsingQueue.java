package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueue {
    static Queue<Integer> q1 = new ArrayDeque<Integer>();
    static Queue<Integer> q2 = new ArrayDeque<>();
    public static void main(String[] args) {
        push(3);
        push(5);
        push(6);
        push(2);
        pop();
    }
    public static void push(int data){
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(data);
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }

    public static void pop(){
        q1.poll();
    }
}
