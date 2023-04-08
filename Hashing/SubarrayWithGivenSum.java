package Hashing;

import java.util.HashMap;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] a = {2,3,21,3,4,4,1,2,};
        int sum = 24;
        unionUnsortedArray(a, sum);
    }
    static void unionUnsortedArray(int[] a, int sum){
        int currSum = 0;
        int start = 0;
        int end = -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i <a.length; i++){
            currSum += a[i];
            if (currSum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
            if (map.containsKey(currSum - sum)){
                start = map.get(currSum - sum)+1;
                end = i;
                break;
            }
            map.put(currSum, i);
        }
        if (end == -1){
            System.out.println("Notfound");
        } else{
            System.out.println(start + " " + end);
        }
    }
}
