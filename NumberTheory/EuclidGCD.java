package NumberTheory;

public class EuclidGCD {
    public static void main(String[] args) {

        int a = GCD(20, 29);

        System.out.println(a);
        
    }

    public static int GCD(int m, int n){
        
        if (n == 0) return m;
        return GCD(n, m%n);
    }
}
