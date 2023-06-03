package Stack;

import java.util.Stack;

public class LargestAreaSubMatrix {
    public static int[][] A = {{1,0,1,1,1},{1,1,0,1,1}, {1,0,1,1,1}, {0,1,1,1,1}};
    public static void main(String[] args) {
        MaxMatrix();
    }

    public static int[] PrevSmall(int[] A){

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

    public static int[] NextSmall(int[] A){

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

    static int MaxHist(int[] A){
        int maxAns = 0;
        int[] ps = PrevSmall(A);
        int[] ns = NextSmall(A);

        for ( int i = 0 ; i < A.length; i++){
            int curr = (ns[i] - ps[i] -1 ) * A[i];
            maxAns = Math.max(maxAns, curr);
        }
        return maxAns;
    }

    public static void MaxMatrix(){
        int curRow[] = A[0];
        int maxAns = MaxHist(curRow);
        System.out.println(curRow[3]);
        System.out.println(maxAns);
        for ( int i = 0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++){
                if (A[i][j] ==1){
                    curRow[j] += 1;

                } else {
                    curRow[j] = 0;
                }
            }
            int curAns = MaxHist(curRow);
            System.out.println(Math.max(maxAns, curAns));
        }
        
    }
}
