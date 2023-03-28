package BitManuplation;

public class Find2NonRepElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,2,4,1};
        int c = 0;
        for (int i = 0; i < arr.length ;i++){
            c ^= arr[i];
        }
        c = (c & -c);
 
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & c) > 0) {
                c1 = (c1 ^ arr[i]);
            }
            else {
                c2 = (c2 ^ arr[i]);
            }
        }
        System.out.println(c1);
        System.out.println(c2);
    }
    
}
