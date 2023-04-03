package Array;

public class MaxSubstring {
    public static void main(String[] args) {
        int[] arr = {1,2,4, -3, 6, 8, -1, 5, -5, 22, -5, -7};
        KadaneAlgo(arr);
    }
    
    public static void KadaneAlgo(int[] arr){

        String max = "";

        String temp = "";

        int count = 0;

        int tempcount = 0;

        for (int i = 0; i<arr.length; i++){

            tempcount += arr[i];
            temp += " + "+arr[i];

            if (tempcount < 0){
                temp = "";
                tempcount = 0;
            }

            if (count < tempcount){
                count = tempcount;
                max = temp;
                System.out.println(max);
                System.out.println(count);
            }

            System.out.println("Final");
            System.out.println(max);
            
        }

    }
}
