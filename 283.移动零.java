/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0 && slow != fast) {
                nums[slow] = nums[fast];
                slow++;
                // 已经调整了位置，可以将当前位置设置为 0
                nums[fast] = 0;
            } else if(nums[fast] != 0 && slow == fast) {
                slow++;
            }
        }
    }
}
// @lc code=end

