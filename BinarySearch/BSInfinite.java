package BinarySearch;

public class BSInfinite {
    public static int[] a = {0,1,2,5,8,9,11,17,18 ,39};
    public static void main(String[] args) {
        Infinite(a, 0, 9, 2);
    
    }

    public static void Infinite(int[] a, int low, int key, int con){
        int high = 1;
        while (a[high] < key){
            low = high;
            high = con * high;
        }
        BS(0, 7, 9);
    }

    public static void BS(int low, int high, int key){
        int mid = (low+high)/2;
        if (a[mid] == key){
            System.out.println(mid);
        }
        if (a[mid] > key){
            BS(low, mid-1, key);
        }
        if (a[mid] < key){
            BS(mid+1, high, key);
        }
    }
}
