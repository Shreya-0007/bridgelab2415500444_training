class IslandCounter {
    static int countIslands(int[][] grid) {
        int count = 0;
        int m = grid.length, n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    dfs(grid, visited, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    static void dfs(int[][] grid, boolean[][] visited, int i, int j) {
        int m = grid.length, n = grid[0].length;

        if (i<0 || j<0 || i>=m || j>=n || grid[i][j]==0 || visited[i][j])
            return;

        visited[i][j] = true;

        dfs(grid, visited, i+1, j);
        dfs(grid, visited, i-1, j);
        dfs(grid, visited, i, j+1);
        dfs(grid, visited, i, j-1);
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1,1,0,0,0},
            {1,1,0,0,1},
            {0,0,1,0,1},
            {0,0,0,1,1}
        };

        System.out.println(countIslands(grid));
    }
}
