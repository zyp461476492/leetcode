/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lo = 0;
        int hi = numbers.length - 1;
        while (lo < hi) {
            int sum = numbers[lo] + numbers[hi];
            if (sum == target) {
                return new int[] {lo + 1, hi + 1};
            } else if (sum > target) {
                hi--;
            } else if (sum < target) {
                lo++;
            }
        }
        throw new IllegalArgumentException("No such answer");
    }
}
// @lc code=end

