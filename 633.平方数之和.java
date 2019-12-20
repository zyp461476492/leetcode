/*
 * @lc app=leetcode.cn id=633 lang=java
 *
 * [633] 平方数之和
 */

// @lc code=start
class Solution {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = new Double(Math.sqrt(c)).intValue();
        int sum = left * left + right * right;
        if (sum == c)
            return true;
        while (left <= right) {
            sum = left * left + right * right;
            if (sum > c) {
                right--;
            } else if (sum == c) {
                return true;
            } else {
                left++;
            }
        }
        return false;
    }
}
// @lc code=end
