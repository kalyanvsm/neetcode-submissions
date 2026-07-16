class Solution {
    public int dfs(int[][] grid, int r, int c, boolean[][] vis){
        int n = grid.length;
        int m = grid[0].length;

        if(r < 0 || c < 0 || r >= n || c >= m) return 0;

        if(grid[r][c] == 0 || vis[r][c]) return 0;

        vis[r][c] = true;

        int area = 1;

        area += dfs(grid, r - 1, c, vis);
        area += dfs(grid, r + 1, c, vis);
        area += dfs(grid, r, c - 1, vis);
        area += dfs(grid, r, c + 1, vis);

        return area;

    }
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] vis = new boolean[n][m];

        int maxArea = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    maxArea = Math.max(maxArea, dfs(grid, i, j, vis));
                }
            }
        }

        return maxArea;
    }
}
