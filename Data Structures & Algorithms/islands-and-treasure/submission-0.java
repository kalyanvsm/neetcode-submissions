class Solution {
    private static final int INF = 2147483647;

    public void islandsAndTreasure(int[][] grid) {
        if(grid == null || grid.length == 0) return;

        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 0) q.offer(new int[]{i, j});
            }
        }

        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while(!q.isEmpty()){
            int[] cell = q.poll();
            int row = cell[0];
            int col = cell[1];

            for(int[] d : dir){
                int r = row + d[0];
                int c = col + d[1];

                if(r < 0 || c < 0 || r >= m || c >= n || grid[r][c] != INF) continue;

                grid[r][c] = grid[row][col] + 1;
                q.offer(new int[]{r, c});
            }
        }
    }
}
