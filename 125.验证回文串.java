/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int p = 0;
        int q = s.length() - 1;
        // s = s.toLowerCase();
        while (p < q) {
            char left = s.charAt(p);
            char right = s.charAt(q);
            boolean notEquals = ((left & 0xDF) != (right & 0xDF));
            if (!Character.isDigit(left) && !Character.isLetter(left)) {
                p++;
            } else if (!Character.isDigit(right) && !Character.isLetter(right)) {
                q--;
            } else if (!notEquals) {
                p++;
                q--;
            } else {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

