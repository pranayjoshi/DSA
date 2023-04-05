
package Sorting;


import java.util.Arrays;


public class shuffle {

    public static void main(String[] args){
        System.out.println(Arrays.toString(numbers));
        Shuffle();
        System.out.println(Arrays.toString(numbers));
    }

    static int[]  numbers = {1,2,3,4,5,6,7,83,2,9};

    public static void Shuffle(){
        int N = numbers.length;
        for (int i = 0; i<N;i++){
            int j = uniform(i);
            exch(i, j);
        }
    }

    public static void exch( int i, int j){

        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static int uniform(int max){
        int min = 0;
        int random = (int)(Math.random()*(max-min+1)+min);
        return random;
    }
}
