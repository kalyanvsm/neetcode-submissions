class NumMatrix {
    int[][] mat;
    public NumMatrix(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;

        mat = new int[R + 1][C + 1];

        for(int i = 0; i < R; i++){
            int prefix = 0;
            for(int j = 0; j < C; j++){
                prefix += matrix[i][j];
                int above = mat[i][j + 1];
                mat[i + 1][j + 1] = prefix + above; 
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1 = row1 + 1;
        col1 = col1 + 1;
        row2 = row2 + 1;
        col2 = col2 + 1;
        
        int bottomRight = mat[row2][col2];
        int left = mat[row2][col1 - 1];
        int above = mat[row1 - 1][col2];
        int topLeft = mat[row1 - 1][col1 - 1];

        return bottomRight - left - above + topLeft;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */