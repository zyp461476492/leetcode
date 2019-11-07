/*
 * @lc app=leetcode.cn id=268 lang=java
 *
 * [268] 缺失数字
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int[] count = new int[nums.length + 1];
        for (int i : nums) {
            count[i]++;
        }
        
       for (int i = 0; i < count.length; i++) {
           if (count[i] == 0)
               return i;
       }
        return 0;
    }
}
// @lc code=end

