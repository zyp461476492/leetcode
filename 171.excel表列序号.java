/*
 * @lc app=leetcode.cn id=171 lang=java
 *
 * [171] Excel表列序号
 */

// @lc code=start
class Solution {
    public int titleToNumber(String s) {
        long sum = 0;
        int n = 0;
        int i = s.length() - 1;
        while (i >= 0) {
            int cur = s.charAt(i) - 'A' + 1;
            sum += Math.pow(26, n) * cur;
            i--;
            n++;
        }
        return (int)sum;
    }
}
// @lc code=end

