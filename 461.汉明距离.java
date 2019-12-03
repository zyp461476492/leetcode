/*
 * @lc app=leetcode.cn id=461 lang=java
 *
 * [461] 汉明距离
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
        // 异或操作，相同为 0 ，不同为 1
        return Integer.bitCount(x ^ y);
    }
}
// @lc code=end

