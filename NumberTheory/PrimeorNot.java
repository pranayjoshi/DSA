package NumberTheory;

public class PrimeorNot {
    public static void main(String[] args) {
        
        int n = 8;
        boolean a = false;
        if ( n == 0 | n == 1){
            a = false;
        }
        for (int i = 2; i < Math.sqrt(n); i++){
            if (n%i == 0) {
                a = true;
                break;
            }
        }
        
        System.out.println(a);

    }
}
