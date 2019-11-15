/*
 * @lc app=leetcode.cn id=367 lang=java
 *
 * [367] 有效的完全平方数
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        // 二分查找
        long lo = 1;
        long hi = num;
        while (lo <= hi) {
            long mid = (lo + hi) >>> 1;
            long res = mid * mid;
            if (res > num) {
                hi = mid - 1;
            } else if (res < num) {
                lo = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

