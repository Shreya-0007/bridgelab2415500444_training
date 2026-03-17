
public class Problem2_WordSearch {

    static int[] dx = {-1,-1,-1,0,0,1,1,1};
    static int[] dy = {-1,0,1,-1,1,-1,0,1};

    public static boolean exist(char[][] board, String word) {
        int n = board.length, m = board[0].length;
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(board, word, i, j, 0, visited))
                    return true;
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, String word, int x, int y, int index, boolean[][] visited) {
        if (index == word.length()) return true;

        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length
                || visited[x][y] || board[x][y] != word.charAt(index))
            return false;

        visited[x][y] = true;

        for (int d = 0; d < 8; d++) {
            if (dfs(board, word, x + dx[d], y + dy[d], index + 1, visited))
                return true;
        }

        visited[x][y] = false; // Backtrack
        return false;
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'C','A','T','S'},
            {'O','R','E','A'},
            {'D','E','A','M'},
            {'E','L','L','S'}
        };

        String word = "DREAM";
        System.out.println("Word Exists: " + exist(grid, word));
    }
}
