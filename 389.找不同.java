/*
 * @lc app=leetcode.cn id=389 lang=java
 *
 * [389] 找不同
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        
        int[] bucket = new int[26];
        for (int i = 0; i < s.length(); i++) {
            bucket[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            bucket[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] < 0) {
                char c = (char)('a' + i);
                return c;
            }
        }
        return ' ';
    }
}
// @lc code=end

