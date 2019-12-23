import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=643 lang=java
 *
 * [643] 子数组最大平均数 I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int p = 0, q = k - 1;
        int len = nums.length;
        double max = Integer.MIN_VALUE;
        double sum = 0.0;
        boolean first = true;
        while (p < len && q < len) {
            if (first) {
                for (int i = p; i <= q; i++) {
                    sum += nums[i];
                }
                first = false;
            } else {
                sum -= nums[p - 1];
                sum += nums[q];
            }

            double aver = sum / k;
            if (aver > max)
                max = aver;
            p++;
            q++;
        }
        return max;
    }
}
// @lc code=end
