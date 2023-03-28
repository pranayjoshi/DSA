package BitManuplation;

public class FindNonRepElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,4,1};
        int c = 0;
        for (int i = 0; i < arr.length ;i++){
            c ^= arr[i];
        }
        System.out.println(c);
    }
    
}
