package Stack;

import java.util.Stack;

public class NextSmallEle {

    public static int[] A = {4,10,5,18,3,12,7};

    public static Stack<Integer> s = new Stack<>();

    public static int[] Result = new int[A.length];
    public static void main(String[] args) {
        PrevSmall();
    }

    public static void PrevSmall(){

        for ( int i = A.length-1; i > 0 ; i--){

            while (!s.isEmpty() && A[i] <= s.peek()){
                s.pop();
            }

            if (s.isEmpty()){
                Result[i] = -1;
                System.out.println(-1);
            } else {
                System.out.println(s.peek());
                Result[i] = s.peek();
            }
            s.push(A[i]);
        }
    }
}
