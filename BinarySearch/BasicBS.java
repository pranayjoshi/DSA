package BinarySearch;

public class BasicBS {
    public static int[] a = {0,1,2,5,8,9,11,17};
    public static void main(String[] args) {
    
        BS(0, 7, 17);
    
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