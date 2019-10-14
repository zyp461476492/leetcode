import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
       
    }
    
    public HashMap<Character, Integer> shiftMap(HashMap<Character, Integer> indexMap, String pattern) {
        HashMap<Character, Integer> map = new HashMap<>(pattern.length());
        char[] charArray = pattern.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
             map.put(c, charArray.length - indexMap.get(c));
        }
    }
    
    public HashMap<Character, Integer> lastIndexMap(String pattern) {
        HashMap<Character, Integer> map = new HashMap<>(pattern.length());
        
        char[] charArray = pattern.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
             map.put(c, i);
        }
        return map;
    }
}
// @lc code=end
