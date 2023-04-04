package Array;

public class MultiStockSell {
    public static void main(String[] args) {
        int[] a = {1,2,3,1,9,1,8};
        UsingSpace(a);
    }

    public static void UsingSpace(int[] a){
        int maxProfit = 0;
        

        for (int i = 1; i < a.length; i++){
            if (a[i] > a[i-1]){
                maxProfit += a[i] - a[i-1];
                
            }
        }
        
        System.out.println(maxProfit);
            
    }
}
