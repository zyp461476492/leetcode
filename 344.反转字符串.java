/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        int p = 0;
        int q = s.length - 1;
        while (p < q) {
            char temp = s[p];
            s[p] = s[q];
            s[q] = temp;
            p++;
            q--;
        }
    }
}
// @lc code=end

