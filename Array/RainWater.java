package Array;

public class RainWater {
    public static void main(String[] args) {
        int[] a = {3,1,2,4,0,1,3,2};
        UsingSpace(a);
    }

    public static int Max(int a, int b){
        if (a > b){
            return a;
        } else return b;
    }

    public static void UsingSpace(int[] a){
        int units = 0;
        int[] left = new int[a.length];
        int[] right = new int[a.length];
        left[0] = a[0];
        right[a.length - 1] = a[a.length-1];

        for (int i = 1; i < a.length; i++){
            left[i] = Max(left[i-1], a[i]);
            System.out.println(left[i]);  
            if (right[a.length -(i)] < a[a.length -(i+1)] ){
                // System.out.println(right[a.length-(i)]);
                right[a.length -(i+1)] = a[a.length -(i+1)];
                // System.out.println(right[a.length-(i)]);
            }else {
                right[a.length -(i)] = right[a.length -(i)];
                // System.out.println(right[a.length-(i)]);
            }
        }

        for (int i =0; i < a.length; i++){

        }
        
        System.out.println(units);
            
    }
}
