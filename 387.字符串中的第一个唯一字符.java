/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        int[] bucket = new int[26];
        boolean[] flag = new boolean[26];
        Arrays.fill(bucket, -1);
        Arrays.fill(flag, false);
        for (int i = 0; i < s.length(); i++) {
            int index = bucket[s.charAt(i) - 'a'];
            if (flag[s.charAt(i) - 'a']) {
                // 已经出现过
                bucket[s.charAt(i) - 'a'] = -1;
            } else {
                // 没有出现过
                bucket[s.charAt(i) - 'a'] = i;
            }
            flag[s.charAt(i) - 'a'] = true;
        }
        
        int ans = Integer.MAX_VALUE;
        for (int index : bucket) {
            // 找到不为-1 且 index 最小的就是最先出现的
            if (index >= 0) {
                if (index < ans) {
                    ans = index;
                }
            }
        }
        
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
// @lc code=end

