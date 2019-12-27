/*
 * @lc app=leetcode.cn id=665 lang=java
 *
 * [665] 非递减数列
 */

// @lc code=start
class Solution {
    public boolean checkPossibility(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                int temp = nums[i];
                if (i >= 1) {
                    // 前一个元素
                    nums[i] = nums[i - 1];
                } else {
                    // 后一个元素
                    nums[i] = nums[i + 1];
                }

                if (nums[i] > nums[i + 1]) {
                    // 恢复 nums[i]
                    nums[i] = temp;
                    nums[i + 1] = nums[i];
                }

                cnt++;
                if (cnt == 2)
                    return false;
            }
        }
        return true;
    }
}
// @lc code=end
