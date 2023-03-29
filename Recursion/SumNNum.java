package Recursion;

public class SumNNum {
    public static void main(String[] args) {
        int sum = Sum(8);
        System.out.println(sum);
    }
    public static int Sum(int n){
        if (n == 1) return 1;
        return n + Sum(n-1);
    }
}
