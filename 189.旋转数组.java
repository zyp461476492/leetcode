/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        while (k > 0) {
            rotateRight(nums);
            k--;
        }
    }
    
    public void rotateRight(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int temp = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 1; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = temp;
    }
}
// @lc code=end

