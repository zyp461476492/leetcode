/*
 * @lc app=leetcode.cn id=674 lang=java
 *
 * [674] 最长连续递增序列
 */

// @lc code=start
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int p = 0;
        int ans = 0;
        while (p < nums.length) {
            int count = 1;
            int q = p + 1;
            while (q < nums.length && nums[q] > nums[p]) {
                count++;
                p++;
                q++;
            }
            if (count > ans)
                ans = count;
            p = q;
        }
        return ans;
    }
}
// @lc code=end
