import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=205 lang=java
 *
 * [205] 同构字符串
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        return getStruct(s).equals(getStruct(t));
    }
    
    private String getStruct(String s) {
        HashMap<Character, Character>  map = new HashMap<>();
        char begin = 'A';
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char cur = s.charAt(i);
            if (map.containsKey(cur)) {
                sb.append(map.get(cur));
            } else {
                sb.append(begin);
                map.put(cur, begin);
                begin++;
            }
        }
        return sb.toString();
    }
}
// @lc code=end

