/*
 * @lc app=leetcode.cn id=463 lang=java
 *
 * [463] 岛屿的周长
 */

// @lc code=start
class Solution {
    public int islandPerimeter(int[][] grid) {
        int len = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1)
                    len += count(i, j, grid);
            }
        }
        return len;
    }

    public int count(int i, int j, int[][] grid) {
        int count = 0;
        if (i - 1 < 0 || grid[i - 1][j] == 0)
            count++;
        if (i + 1 >= grid.length || grid[i + 1][j] == 0)
            count++;
        if (j - 1 < 0 || grid[i][j - 1] == 0)
            count++;
        if (j + 1 >= grid[i].length || grid[i][j + 1] == 0)
            count++;
        return count;
    }
}
// @lc code=end
