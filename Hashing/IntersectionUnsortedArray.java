package Hashing;

import java.util.HashSet;
import java.util.Set;

public class IntersectionUnsortedArray {
    public static void main(String[] args) {
        int[] a = {2,321,34,412,};
        int[] b = {4,2,32,442,13,32};
        unionUnsortedArray(a, b);
    }
    static void unionUnsortedArray(int[] a, int[] b){
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int x: a){
            set.add(x);
        }
        for (int x: b){
            if (set.contains(x)){
                count++ ;
                set.remove(x);
            }
        }
        System.out.println(count); 
    }
}
