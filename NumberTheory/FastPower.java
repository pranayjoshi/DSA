package NumberTheory;

public class FastPower {
    public static void main(String[] args) {

        long a = fastPower(3000000, 5222, 1000000007);

        System.out.println(a);
        
    }

    public static long fastPower(long m, long n, long modval){
        long a = 1;
        while ( n > 0){
            if ((n&1) !=0){
                a = (a * m%modval)%modval;
            }
            m = (m%modval * m %modval)%modval;
            n = n >> 1; // ==> n /= 2
        }
        return a;
    }
}
