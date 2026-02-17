
import java.util.Arrays;

public class Problem3_NQueensOptimized {

    static int N;
    static int[] board;
    static boolean[] cols;
    static boolean[] diag1;
    static boolean[] diag2;

    public static boolean solve(int row) {
        if (row == N) return true;

        for (int col = 0; col < N; col++) {
            if (!cols[col] && !diag1[row - col + N - 1] && !diag2[row + col]) {
                board[row] = col;
                cols[col] = diag1[row - col + N - 1] = diag2[row + col] = true;

                if (solve(row + 1)) return true;

                cols[col] = diag1[row - col + N - 1] = diag2[row + col] = false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        N = 8;
        board = new int[N];
        cols = new boolean[N];
        diag1 = new boolean[2 * N - 1];
        diag2 = new boolean[2 * N - 1];

        if (solve(0)) {
            for (int i = 0; i < N; i++) {
                char[] row = new char[N];
                Arrays.fill(row, '.');
                row[board[i]] = 'Q';
                System.out.println(new String(row));
            }
        } else {
            System.out.println("No Solution Found");
        }
    }
}
