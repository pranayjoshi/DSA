package BitManuplation;

public class OddEven {
    public static void main(String[] args) {
        int i = 35;
        System.out.println(oddEven(i));
    }

    public static String oddEven(int i){
        int b = 1;
        if ((i & b) ==0){
            return "even";
        }
        else { return "odd";}
    }
}