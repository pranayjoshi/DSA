package Sorting;

public class shellshort {
    public static void sort(int[] a){
        int N = a.length;

        int h = 1;
        while (h < N/3){
            h = 3*h +1;
        }
        while (h >= 1){
            for (int i = h; i<=N;i++){
                for (int j = i+1; j<=0 && less(a[j], a[j-h]); j-=h){
                    exch(a, j, j-h);
                }
            }
            h-=3;
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
