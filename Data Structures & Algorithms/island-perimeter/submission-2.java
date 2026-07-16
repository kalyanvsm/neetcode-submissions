class Solution {
    public int dfs(int[][] grid, int r, int c, boolean[][] vis){
        int n = grid.length;
        int m = grid[0].length;

        if(r < 0 || c < 0 || r >= n || c >= m) return 1;

        if(grid[r][c] == 0) return 1;

        if(vis[r][c]) return 0;

        vis[r][c] = true;

        int p = 0;
        p += dfs(grid, r - 1, c, vis);
        p += dfs(grid, r + 1, c, vis);
        p += dfs(grid, r, c - 1, vis);
        p += dfs(grid, r, c + 1, vis);

        return p;
    }
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] vis = new boolean[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    return dfs(grid, i, j, vis);
                }
            }
        }

        return 0;
    }
}