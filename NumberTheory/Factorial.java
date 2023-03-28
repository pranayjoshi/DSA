package NumberTheory;

public class Factorial {
    
    public static void main(String[] args) {
        int a = 5;
        int x = 1;
        for (int i = 2; i <= a; i++){
            x *= i;
        }
        System.out.println(x);
    }
}
