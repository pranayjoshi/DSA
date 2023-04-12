package PriorityQueue;


public class PrintKLargestEle {
    public static int[] A = {3,1,2,4,0,1,3,2};
    public static void main(String[] args) {
        KLargest(4);
    }

    static void KLargest(int k){
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();

        for (int i = 0; i<k; i++){
            pq.add(A[i]);
        }

        for (int i = k; i < A.length; i++){
            if (pq.peek() < A[i]){
                pq.poll();
                pq.add(A[i]);
            }
        }

        System.out.println(pq.peek());
    }
}
