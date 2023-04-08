package Hashing;

import java.util.HashMap;

public class LargestSubWithGivenSum {
    public static void main(String[] args) {
        int[] a = {2,3,21,3,4,4,13,1,2,};
        int sum = 24;
        unionUnsortedArray(a, sum);
    }
    static void unionUnsortedArray(int[] a, int sum){
        int currSum = 0;
        int start = 0;
        int end = -1;
        int largestLen = 0;
        int tempStart = 0;
        int tempEnd = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i <a.length; i++){
            currSum += a[i];
            if (currSum - sum == 0) {
                tempStart = 0;
                tempEnd = i;
            }
            if (map.containsKey(currSum - sum)){
                tempStart = map.get(currSum - sum)+1;
                tempEnd = i;
                if (tempEnd - tempStart > largestLen){
                    largestLen = tempEnd - tempStart;
                    end = tempEnd;
                    start = tempStart;
                }
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
