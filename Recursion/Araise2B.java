package Recursion;

public class Araise2B {
    public static void main(String[] args) {
        System.out.println(Ar2B(2, 8));
    }
    public static int Ar2B(int a, int b){
        if (b == 1)return 1;
        return (a * Ar2B(a, b-1));
    }
}
