/*
 * @lc app=leetcode.cn id=405 lang=java
 *
 * [405] 数字转换为十六进制数
 */

// @lc code=start
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        String hex = "0123456789abcdef";
        StringBuilder sb = new StringBuilder();
        while (num != 0 && sb.length() < 8 ) {
            sb.append(hex.charAt(num & 0xf));
            num = num >> 4;
        }
        return sb.reverse().toString();
    }
}
// @lc code=end

