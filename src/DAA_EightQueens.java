public class DAA_EightQueens {
    final int N = 8;  // Size of the chessboard

    // Function to print the solution
    void printSolution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }

    // Function to check if placing a queen at board[row][col] is safe
    boolean isSafe(int board[][], int row, int col) {
        // Check this column on upper side
        for (int i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;

        // Check upper diagonal on left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check upper diagonal on right side
        for (int i = row, j = col; i >= 0 && j < N; i--, j++)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    // Solves the N Queen problem using backtracking
    boolean solveNQUtil(int board[][], int row) {
        // If all queens are placed, return true
        if (row >= N)
            return true;

        // Try placing queen in all columns one by one
        for (int col = 0; col < N; col++) {
            // Check if placing a queen here is safe
            if (isSafe(board, row, col)) {
                // Place the queen
                board[row][col] = 1;

                // Recur to place rest of the queens
                if (solveNQUtil(board, row + 1))
                    return true;

                // If placing queen here doesn't lead to a solution, remove it (backtrack)
                board[row][col] = 0;
            }
        }

        // If the queen cannot be placed in any column, return false
        return false;
    }

    // Solves the N Queen problem
    boolean solveNQ() {
        int board[][] = new int[N][N];

        if (!solveNQUtil(board, 0)) {
            System.out.println("Solution does not exist");
            return false;
        }

        printSolution(board);
        return true;
    }

    public static void main(String args[]) {
        DAA_EightQueens Queen = new DAA_EightQueens();
        Queen.solveNQ();
    }
}

