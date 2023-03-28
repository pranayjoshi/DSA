package NumberTheory;

import java.util.Arrays;

public class TotalPrimeNum {
    public static void main(String[] args) {

        boolean[] arr = sieveofEratoSthenes(20);
        int trueCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                trueCount++;
            }
            if (trueCount >= 6) {
                break;
            }
        }

        System.out.println(trueCount);
        
    }

    public static boolean[] sieveofEratoSthenes(int n){
        boolean[] arr = new boolean[n+1];

        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i < Math.sqrt(n); i++){
            for(int j = 2*i; j<=n; j+=i){
                arr[j] = false;
            }
        }
        return arr;
    }
}
