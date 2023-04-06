package BinarySearch;

public class BSRotated {
    public static int[] a = {0,1,2,5,8,9,11,17,18 ,39};
    public static void main(String[] args) {
        BS(0, 9, 2);
    
    }

    public static boolean isSorted(int[] a, int low, int high){
        if (a[low] < a[high]){
            return true;
        } else return false;
    }

    public static void BS(int low, int high, int key){
        
        while (low <= high){
            int mid = (low+high)/2;
            if (a[mid] == key){
                System.out.println(mid);
            }
            if (a[low] <= a[mid]){
                if ( key >= a[low] && a[mid] > key){
                    high = mid-1;
                } else {
                    low = mid +1;
                }
            }
            else {
    
                if ( key > a[mid] && a[high] >= key){
                    low = mid +1;
                    
                } else {
                    high = mid-1;
                }
    
            }
        }
        
        
    }
}
