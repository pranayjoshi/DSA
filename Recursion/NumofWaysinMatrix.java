package Recursion;

public class NumofWaysinMatrix {
    public static void main(String[] args) {
        System.out.println(Ways(3, 3));
    }

    public static int Ways(int row, int col){

        if (row ==1 | col ==1) return 1;
        return Ways(row, col -1) + Ways(row -1, col);
    }
}
