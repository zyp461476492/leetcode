/*
 * @lc app=leetcode.cn id=645 lang=java
 *
 * [645] 错误的集合
 */

// @lc code=start
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] bucket = new int[nums.length + 1];
        for (int n : nums) {
            bucket[n]++;
        }

        int[] res = new int[2];
        for (int i = 1; i < bucket.length; i++) {
            if (bucket[i] == 2)
              res[0] = i;
            if (bucket[i] == 0)
                res[1] = i;
        }
        return res;
    }
}
// @lc code=end

