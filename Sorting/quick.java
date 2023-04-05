package Sorting;

public class quick {
    public static int[] a = {3,1,2,4,0,1,3,2};
    public static void main(String[] args) {
        
    QuickSort(0, 7);
        for (int i = 0; i < a.length; i++) System.out.println(i);
    }

    public static void QuickSort(int low, int high){
        if (low < high){
            int pivot = Partition(low, high);
            QuickSort(low, pivot-1);
            QuickSort(pivot+1, high);
        }
    }

    public static int Partition(int low, int high){
        int pivot = a[low]; 
        int i = low;
        int j = high;
        while (i < j){
            while(a[i] <= pivot){
                while (a[j] > pivot){
                    
                    j--;
                }
                i++;
            }
            if (i < j)exch(a, i, j);
        }
        exch(a, j, low);
        return j;
    }

    public static int[] exch(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
}
