/*
 * @lc app=leetcode.cn id=448 lang=java
 *
 * [448] 找到所有数组中消失的数字
 */

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] bucket = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            bucket[nums[i]]++;
        }
        
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= bucket.length - 1; i++) {
            if (bucket[i] == 0)
                res.add(i);
        }
        return res;
    }
}
// @lc code=end

