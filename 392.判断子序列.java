/*
 * @lc app=leetcode.cn id=392 lang=java
 *
 * [392] 判断子序列
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        int p = 0;
        int q = 0;
        while (p < s.length() && q < t.length()) {
            char a = s.charAt(p);
            char b = t.charAt(q);
            if (a == b) {
                p++;
                q++;
            } else {
                q++;
            }
        }
        return p == s.length();
    }
}
// @lc code=end

