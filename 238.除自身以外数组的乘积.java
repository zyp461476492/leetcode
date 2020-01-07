/*
 * @lc app=leetcode.cn id=238 lang=java
 *
 * [238] 除自身以外数组的乘积
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length < 1) return null;
        int[] output = new int[nums.length];
        int[] leftMulti = new int[nums.length];
        int[] rightMulti = new int[nums.length];
        int left = 1;
        int right = 1;
        leftMulti[0] = 0;
        rightMulti[nums.length - 1] = 0;
        for (int i = 1; i < nums.length; i++) {
            left = left * nums[i - 1];
            leftMulti[i] = left;
        }

        for (int i = nums.length - 2; i >=0 ;i--) {
            right = right * nums[i + 1];
            rightMulti[i] = right;
        }
       
        for (int i = 0; i < nums.length; i++) {
            output[i] = leftMulti[i] * rightMulti[i];
        }

        output[0] = rightMulti[0];
        output[nums.length - 1] = leftMulti[nums.length - 1];
        
        return output;
    }
}
// @lc code=end

