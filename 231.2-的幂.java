/*
 * @lc app=leetcode.cn id=231 lang=java
 *
 * [231] 2的幂
 */

// @lc code=start
class Solution {
    public boolean isPowerOfTwo(int n) {
        while (n > 1) {
            int remainder = n % 2;
            if (remainder != 0) return false;
            n = n / 2;
        }
        
        return n == 1;
    }
}
// @lc code=end

