import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=290 lang=java
 *
 * [290] 单词规律
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strList = str.split(" ");
        if (pattern.length() != strList.length) return false;
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (!map.containsKey(c)) {
                if (map.containsValue(strList[i])) return false;
                map.put(c, strList[i]);
            } else {
                String s = map.get(c);
                if (!s.equals(strList[i])) return false;
            }
        }
        return true;
    }
}
// @lc code=end

