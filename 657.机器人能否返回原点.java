/*
 * @lc app=leetcode.cn id=657 lang=java
 *
 * [657] 机器人能否返回原点
 */

// @lc code=start
class Solution {
    public boolean judgeCircle(String moves) {
        if (moves.isEmpty())
            return true;
        int[] bucket = new int['Z'];
        for (char c : moves.toCharArray()) {
            bucket[c]++;
        }
        
        return bucket['U'] == bucket['D'] && bucket['L'] == bucket['R'];
    }
}
// @lc code=end

