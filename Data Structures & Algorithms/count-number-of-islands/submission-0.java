class Solution {
    public void dfs(char[][] grid, boolean[][] vis, int r, int c){
        int rows = grid.length;
        int cols = grid[0].length;

        if(r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == '0' || vis[r][c]){
            return;
        }

        vis[r][c] = true;

        dfs(grid, vis, r - 1, c);
        dfs(grid, vis, r + 1, c);
        dfs(grid, vis, r, c - 1);
        dfs(grid, vis, r, c + 1);
    }
    
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;

        int rows = grid.length;
        int cols = grid[0].length;

        int count = 0;

        boolean[][] vis = new boolean[rows][cols];

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if(grid[r][c] == '1' && !vis[r][c]){
                    dfs(grid, vis, r, c);
                    count++;
                }
            }
        }

        return count;
    }
}
