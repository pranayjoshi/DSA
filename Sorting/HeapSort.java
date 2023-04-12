package Sorting;

public class HeapSort {
    public static int[] A = {3,1,2,4,0,1,3,2};
    public static void main(String[] args) {
        
    }
    static void Heapify(int n, int i){
        int largest = i;
        int l = 2*i;
        int r = (2*i)+1;
        if (l<=n && A[l]>A[largest]){
            largest = l;
        }
        if (r<=n && A[r]>A[largest]){
            largest = r;

        }
        if (largest !=i){
            swap(i, largest);
            Heapify(n, largest);
        }
    }

    static void buildHeap(int n){
        for (int i = n/2; i> 0; i--){
            Heapify(n, i);
        }
    }

    static void swap(int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
