package Sorting;

public class merge {
    public static int[] a = {3,1,2,4,0,1,3,2};
    public static void main(String[] args) {
        
    MergeSort(0, 7);
        for (int i = 0; i < a.length; i++) System.out.println(i);
    }

    public static void MergeSort(int low, int high){
        if (low < high){
            int mid = (low+high)/2;
            MergeSort(low, mid);
            MergeSort(mid+1, high);
            Merge(a, low, mid, high);
        }
    }

    public static void Merge(int[] a, int low, int mid, int high){
        int i = low;
        int j = mid+1;
        int k = low;
        int[] b = new int[a.length];
        while (i <= mid && j <= high){
            if (a[i] < a[j]){
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }
        if (i > mid){
            while (j <= high){
                b[k] = a[j];
                j++;
                k++;
            }
        } else{
            while (j <= mid){
                b[k] = a[i];
                i++;
                k++;
            }
        }

        for (int s = 0; s < a.length; s++){
            a[s] = b[s];
        }
    }
}
