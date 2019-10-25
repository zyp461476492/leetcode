/*
 * @lc app=leetcode.cn id=168 lang=java
 *
 * [168] Excel表列名称
 */

// @lc code=start
class Solution {
    public String convertToTitle(int n) {
        if (n <= 0) return "";
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            sb.append((char)(n % 26 + 'A'));
            n = n / 26;
        }
        return sb.reverse().toString();
    }
}
// @lc code=end

