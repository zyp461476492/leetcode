/*
 * @lc app=leetcode.cn id=240 lang=java
 *
 * [240] 搜索二维矩阵 II
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;
        int i = 0;
        while (i < matrix.length) {
            int[] array = matrix[i];
            if (array.length == 0) {
                i++;
                continue;
            }
            int max = array[array.length - 1];
            if (max == target)
                return true;
            if (max > target) {
                for (int index = 0; index < array.length; index++)
                    if (array[index] == target)
                        return true;
                // int index = Arrays.binarySearch(array, target);
                // if (index != -1) return true;
            }
            i++;
        }
        return false;
    }
}
// @lc code=end
