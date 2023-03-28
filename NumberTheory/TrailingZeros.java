package NumberTheory;

public class TrailingZeros {
        public static void main(String[] args) {
        int n= 30;
        int Total = 0;

        for (int x = 1; Math.pow(5,x)< n; x++){
            double temp = (int)n/Math.pow(5,x);
            Total += temp;
        }
        System.out.println(Total);
    }
}
