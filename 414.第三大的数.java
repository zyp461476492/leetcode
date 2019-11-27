/*
 * @lc app=leetcode.cn id=414 lang=java
 *
 * [414] 第三大的数
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        long one = nums[0];
        long two = Long.MIN_VALUE;
        long three = Long.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num == one || num == two || num == three) {
                // 已经处理过，继续处理下一个
                continue;
            }
            if (num > one) {
                three = two;
                two = one;
                one = num;
            } else if (num > two) {
                three = two;
                two = num;
            } else if (num > three) {
                three = num;
            }
        }
        if (three == Long.MIN_VALUE)
            return (int)one;
        else 
            return (int)three;
    }
}
// @lc code=end

