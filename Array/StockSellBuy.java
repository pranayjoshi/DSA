package Array;

public class StockSellBuy {
    public static void main(String[] args) {
        int[] a = {1,2,3,1,9,1,8};
        UsingSpace(a);
    }

    public static void UsingSpace(int[] a){
        int[] spacedArray = new int[ a.length] ;
        for (int i = 0; i < a.length; i++)
            System.out.println(spacedArray[i]);
    }
}
