package Array;

public class MooreVoting {
    public static void main(String[] args) {
        int[] a = {1,2,31,1,1};
        MooreVotingAlgo(a);
    }

    public static void MooreVotingAlgo(int[] a){
        int ansIndex = 0;
        int count = 1;

        for(int i = 0; i< a.length; i++){
            if (a[i] == a[ansIndex]){
                count++;
            }
            else count--;
            if (count == 0) {
                ansIndex=i;
                count=1;
            }
        }

        count = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] == a[ansIndex]){
                count+=1;
            }
        }
        if (count > a.length/2) System.out.print(a[ansIndex]);
    }
}
