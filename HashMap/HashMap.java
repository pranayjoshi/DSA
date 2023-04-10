package HashMap;

public class HashMap {
    public static int[] A = {3,1,2,4,0,1,3,2};
    public static void main(String[] args) {
        Insert();
    }

    static void Insert(int n,int value){
        n = n+1;
        A[n] = value;
        int i = n;
        while ( i > 1){
            int parent = i/2;
            if (A[parent] <A[i]){
                swap(parent, i);
                i = parent;
            } else return;
        }
    }
    static void swap(int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
