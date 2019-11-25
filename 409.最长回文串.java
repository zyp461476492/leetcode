import java.util.HashMap;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=409 lang=java
 *
 * [409] 最长回文串
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int p = 0;
        while (p < s.length()) {
            char c = s.charAt(p);
            map.put(c, map.getOrDefault(c, 0) + 1);
            p++;
        }

        Set<Character> keySet = map.keySet();
        int res = 0;
        boolean carry = false;
        for (char c : keySet) {
            int count = map.get(c);
            if (count % 2 == 0) {
                res += count;
            } else {
                res += count - 1;
                carry = true;
            }
        }
        return carry ? res + 1 : res;
    }
}
// @lc code=end

