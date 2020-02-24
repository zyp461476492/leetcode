class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;
        int row = 0;
        int col = matrix[0].length - 1;
        int rows = matrix.length;
        while (row < rows && col >= 0) {
            int cur = matrix[row][col];
            if (cur < target) {
                // 剔除当前行
                row++;
            } else if (cur > target) {
                // 剔除当前列
                col--;
            } else {
                return true;
            }
        }
        return false;
    }
}