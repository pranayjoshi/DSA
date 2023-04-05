package Sorting;

public class Selection{
    private static int[] a = {1,3,2,7,9,6,5,3};
    public static void main(String[] args){
        sort();
        for (int i = 0; i < a.length; i++) System.out.println(i);
        
    }
    public static void sort(){
        int N = a.length;
        for (int i = 0; i<N;i++){
            int min = i;
            for (int j = i+1; j<N; j++){
                if (less(a[j], a[min])){
                    min = j;
                }
            }
            exch(i, min);
        }
    }

    public static boolean less(int x, int y){
        return x < y;
    }

    public static int[] exch(int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
    
}
