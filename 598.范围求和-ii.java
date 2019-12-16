/*
 * @lc app=leetcode.cn id=598 lang=java
 *
 * [598] 范围求和 II
 */

// @lc code=start
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        for (int[] op : ops) {
            // min x
            m = Math.min(m, op[0]);
            // min y
            n = Math.min(n, op[1]);
        }
        return m * n;
    }
}
// @lc code=end
