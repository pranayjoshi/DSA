package BinarySearch;

public class BookAllocation {
    public static int[] a = {10,5,20};
    public static void main(String[] args) {
        BS(a, 2);
    
    }

    public static boolean isFeasible(int[] a, int key, int res){
        int stud = 1;
        int sum = 0;
        for (int i =0; i < a.length; i++){
            if ((sum + a[i]) > res){
                stud ++ ;
                sum = a[i];
            } else {
                sum += a[i];
            }
        }
        return stud <= key;
    }

    public static int SumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {  
               sum = sum + arr[i];  
        }  
        return sum; 
    } 
    
    public static int MaxOfArray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {  
            if (arr[i] > max){
             max = arr[i];
            };  
         }  
         return max;
    } 

    public static void BS(int[]a, int key){
        int min = MaxOfArray(a);
        int max = SumOfArray(a);
        int res = 0;

        while (max >= min){
            int mid = (min+max) /2;
            if (isFeasible(a, key, res)){
                res = mid;
                max = mid-1;
            } else {
                min = mid+1;
            }
        }
        System.out.println(res);
    }
}
