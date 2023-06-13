package Queue;

import java.util.Stack;

public class QueueUsingStack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    public static void main(String[] args) {
        push(3);
        push(5);
        push(6);
        push(2);
        pop();
    }
    public static void push(int data){
        s1.push(data);
    }

    public static void pop(){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int ans = s2.pop();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        System.out.println(ans);
    }
}
