/*
 * @lc app=leetcode.cn id=383 lang=java
 *
 * [383] 赎金信
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] bucket = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            bucket[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            bucket[ransomNote.charAt(i) - 'a']--;
        }

        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] < 0) return false;
        }

        return true;
    }
}
// @lc code=end

