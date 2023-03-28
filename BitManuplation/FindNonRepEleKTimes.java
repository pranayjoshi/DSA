package BitManuplation;

public class FindNonRepEleKTimes {

    public static void main(String[] args) {

        int k = 3;
        int[] arr = {1,1,2,3,2,2,1};
        int c = 0;
        int n = arr.length;
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

        int INT_SIZE = 8 * 4;
        int count[] = new int[INT_SIZE];
 
        // AND(bitwise) each element of the array
        // with each set digit (one at a time)
        // to get the count of set bits at each
        // position
        for (int i = 0; i < INT_SIZE; i++)
            for (int j = 0; j < n; j++)
                if ((arr[j] & (1 << i)) != 0)
                    count[i] += 1;

        int res = 0;
        for (int i = 0; i < INT_SIZE; i++)
            res += (count[i] % k) * (1 << i);

        res = res / (n % k);
        System.out.println(res);
    }
    
}

