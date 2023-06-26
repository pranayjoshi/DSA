package Queue;

import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(10);
        dq.offerLast(3);
    }
}
