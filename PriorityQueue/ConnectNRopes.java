package PriorityQueue;

public class ConnectNRopes {
    public static int[] A = {3,1,2,4,0,1,3,2};
    public static void main(String[] args) {
        minCost();
    }

    static void minCost(){
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();

        for (int i = 0; i<A.length; i++){
            pq.add(A[i]);
        }

        int ans = 0;

        while (pq.size() >1 ){
            int first = pq.poll();
            int second = pq.poll();

            int sum = first+second;
            ans += sum;
            pq.add(sum);
        }

        System.out.println(ans);
    }
}
