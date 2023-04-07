package Hashing;

import java.util.HashSet;
import java.util.Set;

public class DistinctElements {
    public static void main(String[] args) {
        int[] a = {1,3,42,1,3,4};
        countDistinct(a);
    }
    static void countDistinct(int[] a){
        Set<Integer> set = new HashSet<>();
        for (int ele: a){
            set.add(ele);
        }
        System.out.println(set.size());
    }
}
