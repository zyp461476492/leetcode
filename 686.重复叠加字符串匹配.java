/*
 * @lc app=leetcode.cn id=686 lang=java
 *
 * [686] 重复叠加字符串匹配
 */

// @lc code=start
class Solution {
    public int repeatedStringMatch(String A, String B) {
        int len = B.length() + A.length() * 2;
        String repeatA = A;
        for (int count = 1; repeatA.length() <= len; count++, repeatA += A ) {
            if (repeatA.lastIndexOf(B) != -1) return count;
        }
        return -1;
    }
}
// @lc code=end

