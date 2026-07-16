class Solution {
    private int rows, cols;

    public void dfs(char[][] board, int r, int c){
        if(r < 0 || c < 0 || r >= rows || c >= cols) return;
        if(board[r][c] != 'O') return;

        board[r][c] = 'S';

        dfs(board, r + 1, c);
        dfs(board, r - 1, c);
        dfs(board, r, c + 1);
        dfs(board, r, c - 1);
    }
    public void solve(char[][] board) {
        if(board == null || board.length == 0) return;

        rows = board.length;
        cols = board[0].length;

        for(int r = 0; r < rows; r++){
            dfs(board, r, 0);
            dfs(board, r, cols - 1);
        }

        for(int c = 0; c < cols; c++){
            dfs(board, 0, c);
            dfs(board, rows - 1, c);
        }

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if(board[r][c] == 'S') board[r][c] = 'O';
                else if(board[r][c] == 'O') board[r][c] = 'X';
            }
        }
    }
}
