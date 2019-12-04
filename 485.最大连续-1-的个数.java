/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续1的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        int i = 0; 
        while (i < nums.length) {
            while ( i < nums.length && nums[i] == 1) {
                count++;
                i++;
            }
            if (count > max) {
                max = count;
            }
            count = 0;
            i++;
        }
        return max;
    }
}
// @lc code=end

