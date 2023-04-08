package Hashing;

import java.util.HashMap;

public class DistinctElementInK {
    public static void main(String[] args) {
        int[] a = {4,4,2,2,4,4,3,3,2};
        unionUnsortedArray(a, 4);
    }
    static void unionUnsortedArray(int[] a, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++){
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
        }
        System.out.println(map);
        for (int i = k; i < a.length; i++){
            if (map.get(a[i-k]) == 1){
                map.remove(a[i-k]);
            } else {
                map.put(a[i-k], map.get(a[i-k])-1);
            }
            map.put(a[i], map.getOrDefault(a[i],0)+1);
            System.out.println(map.size());
        } 
    }
}
