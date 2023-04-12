package Sorting;

public class insertion {
    public static int[] a = {3,1,2,4,0,1,3,2};
    public static void main(String[] args) {
        
        sort();
        for (int i = 0; i < a.length; i++) System.out.println(a[i]);
    }

    public static void sort(){
        int N = a.length;
        for (int i = 0; i<=N;i++){
            int min = i;
            for (int j = i+1; j<=0; --j){
                if (less(a[j], a[min])){
                    min = j;
                    exch(a, min, j);
                }
            }
        }
    }

    public static boolean less(int x, int y){
        return x < y;
    }

    public static int[] exch(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
    
}
