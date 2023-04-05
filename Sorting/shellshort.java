package Sorting;

public class shellshort {
    public static void sort(Comparable[] a){
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

    public static boolean less(Comparable x, Comparable y){
        return x.compareTo(y) < 0;
    }

    public static Comparable[] exch(Comparable[] a, int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
}
