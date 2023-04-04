package Array;

public class MaxProfit {
    public static void main(String[] args) {
        int[] a = {1,2,3,1,9,1,8};
        UsingSpace(a);
    }

    public static void UsingSpace(int[] a){

        int min = a[0];
        int maxProfit = 0;

        for (int i = 0; i < a.length-1; i++){
            if (a[i] < min){
                min = a[i];
                
            }
            int profit = a[i] - min;
            if (maxProfit < profit){maxProfit = profit;}
        }

        
        System.out.println(maxProfit);
            
    }
}
