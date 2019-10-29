/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = getSqrtSum(slow);
            fast = getSqrtSum(fast);
            fast = getSqrtSum(fast);
        } while (slow != fast);
        return fast == 1;
    }
    
    public int getSqrtSum(int n) {
        int res = 0;
        while (n != 0) {
            res += (n % 10) * (n % 10);
            n = n / 10;
        }
        return res;
    }
}
// @lc code=end

