class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int R = matrix.length, C = matrix[0].length;

        int l = 0, r = R * C - 1;

        while(l <= r){
            int m = l + (r - l) / 2;
            int row = m / C, col = m % C;

            if(target > matrix[row][col]) l = m + 1;
            else if(target < matrix[row][col]) r = m - 1;
            else return true;
        }

        return false;
    }
}
