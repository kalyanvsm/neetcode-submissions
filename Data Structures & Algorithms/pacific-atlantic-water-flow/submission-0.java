class Solution {
    private int rows, cols;
    private static final int[][] DIRS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public void dfs(int[][] heights, int r, int c, boolean[][] vis, int prevHeight){
        if(r < 0 || c < 0 || r >= rows || c >= cols) return;
        if(vis[r][c]) return;
        if(heights[r][c] < prevHeight) return;

        vis[r][c] = true;

        for(int[] d : DIRS){
            int nr = r + d[0];
            int nc = c + d[1];
            dfs(heights, nr, nc, vis, heights[r][c]);
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        if(heights == null || heights.length == 0 || heights[0].length == 0) return res;

        rows = heights.length;
        cols = heights[0].length;

        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        for(int c = 0; c < cols; c++){
            dfs(heights, 0, c, pacific, heights[0][c]);
            dfs(heights, rows - 1, c, atlantic, heights[rows - 1][c]);
        }

        for(int r = 0; r < rows; r++){
            dfs(heights, r, 0, pacific, heights[r][0]);
            dfs(heights, r, cols - 1, atlantic, heights[r][cols - 1]);
        }

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if(pacific[r][c] && atlantic[r][c]){
                    res.add(Arrays.asList(r,c));
                }
            }
        }

        return res;
    }
}
