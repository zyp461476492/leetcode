import java.util.List;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>(numRows);
        int i = 0;
        while (i < numRows) {
            int len = i + 1;
            int j = 0;
            List<Integer> row = new ArrayList<>();
            while (j < len) {
                row.add(0);
                j++;
            }
            // 首尾元素，固定为1
            row.set(0, 1);
            row.set(i, 1);
            for (j = 1; j < len - 1; j++) {
                // 不用考虑越界问题，因为默认已经添加了两个元素
                List<Integer> prev = answer.get(i - 1);
                row.set(j, prev.get(j - 1) + prev.get(j));
            }
            answer.add(row);
            i++;
        }
        return answer;
    }
    
}
// @lc code=end

