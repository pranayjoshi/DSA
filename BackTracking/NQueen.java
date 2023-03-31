package BackTracking;

public class NQueen {
    final static int N = 4;
    public static void main(String[] args) {
        int board[][] = { { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 } };
        int row = 0;
        System.out.println(nQueen(board, row));
    }

    public static void printSolution(int board[][])
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                                 + " ");
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] board, int row, int col){
        int i, j;
 
        /* Check this row on left side */
        for (i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;
 
        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;
 
        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;
 
        return true;
    }

    public static boolean nQueen(int[][] board, int row){
        
        if (row == N){
            printSolution(board);
            return true;
        }
        for (int col=0; col < N; col++){
            if (isSafe(board, row, col)){
                board[row][col] = 1;
                if (nQueen(board, row+1)){
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }
}
