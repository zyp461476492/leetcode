/*
 * @lc app=leetcode.cn id=292 lang=java
 *
 * [292] Nim 游戏
 */

// @lc code=start
class Solution {
    public boolean canWinNim(int n) {
        // 巴什博奕
        return n % 4 != 0;
    }
}
// @lc code=end

