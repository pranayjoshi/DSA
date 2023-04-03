package Array;

public class StockSellBuy {
    public static void main(String[] args) {
        int[] a = {1,2,3,1,9,1,8};
        UsingSpace(a);
    }

    public static void UsingSpace(int[] a){
        int[] spacedArray = new int[ a.length] ;
        spacedArray[spacedArray.length-1] = a[a.length-1];

        int buy = 0;

        for (int i = a.length-2; i >= 0; i--){
            if (a[i] > a[i+1]){
                spacedArray[i] = a[i];
            } else {
                spacedArray[i] = a[i+1];
            }

            if ((spacedArray[i] - a[i]) > buy) buy = a[i];
        }

        int sell = spacedArray[0];

        System.out.println(spacedArray);
        System.out.println(buy);
        System.out.println(sell);
            
    }
}
