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

        for ( int i = 0 ; i < A.length; i++){

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
        
        
        s.push(20);
        s.push(30);
        
        while (s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

        System.out.println(s.size());
    }
}
