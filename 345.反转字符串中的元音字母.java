/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        int p = 0;
        int q = s.length() - 1;
        char[] list = s.toCharArray();
        while (p < q) {
            if (isUnivocalic(list[p]) && isUnivocalic(list[q])) {
                char temp = list[p];
                list[p] = list[q];
                list[q] = temp;
                p++;
                q--;
            } else if (isUnivocalic(list[p]) && !isUnivocalic(list[q])) {
                q--;
            } else if (!isUnivocalic(list[p]) && isUnivocalic(list[q])) {
                p++;
            } else {
                p++;
                q--;
            }
        }
        return new String(list);
    }

    public boolean isUnivocalic(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
// @lc code=end
