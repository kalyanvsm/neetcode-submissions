class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return -1;

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        int fresh = 0;

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if(grid[r][c] == 1) fresh++;
                else if(grid[r][c] == 2) q.offer(new int[]{r, c});
            }
        }

        if(fresh == 0) return 0;

        int mins = 0;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while(!q.isEmpty()){
            int size = q.size();
            boolean rottenNow = false;

            for(int i = 0; i < size; i++){
                int[] cell = q.poll();
                int row = cell[0];
                int col = cell[1];

                for(int[] dir : dirs){
                    int r = row + dir[0];
                    int c = col + dir[1];

                    if(r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] != 1) continue;

                    grid[r][c] = 2;
                    fresh--;
                    rottenNow = true;
                    q.offer(new int[]{r, c});
                }
            }
            if(rottenNow) mins++;
        }
        return fresh == 0 ? mins : -1;
    }
}
