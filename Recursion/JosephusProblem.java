package Recursion;

public class JosephusProblem {
    public static void main(String[] args) {
        System.out.println(Calc(5, 3));
    }

    public static int Calc(int n, int k){
        if (n == 1)return 0;
        return (Calc(n-1, k)+k)%n;
    }
}
