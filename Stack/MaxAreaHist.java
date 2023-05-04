package Stack;

import java.util.Stack;

public class MaxAreaHist {

    public static int[] A = {4,10,5,18,3,12,7};
    public static void main(String[] args) {
        MaxHist();
    }

    public static int[] PrevSmall(){

        Stack<Integer> s = new Stack<>();

        int[] ps = new int[A.length];

        for ( int i = 0 ; i < A.length; i++){

            while (!s.isEmpty() && A[i] <= s.peek()){
                s.pop();
            }

            if (s.isEmpty()){
                ps[i] = -1;
            } else {
                ps[i] = s.peek();
            }
            s.push(A[i]);
        }
        return ps;
    }

    public static int[] NextSmall(){

        Stack<Integer> s = new Stack<>();

        int[] ps = new int[A.length];

        for ( int i = A.length-1; i > 0 ; i--){

            while (!s.isEmpty() && A[i] <= s.peek()){
                s.pop();
            }

            if (s.isEmpty()){
                ps[i] = -1;
            } else {
                ps[i] = s.peek();
            }
            s.push(A[i]);
        }
        return ps;
    }

    static void MaxHist(){
        int maxAns = 0;
        int[] ps = PrevSmall();
        int[] ns = NextSmall();

        for ( int i = 0 ; i < A.length; i++){
            int curr = (ns[i] - ps[i] -1 ) * A[i];
            maxAns = Math.max(maxAns, curr);
        }
        System.out.println(maxAns);
    }
}
