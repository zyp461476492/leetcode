/*
 * @lc app=leetcode.cn id=447 lang=java
 *
 * [447] 回旋镖的数量
 */

// @lc code=start
class Solution {
    public int numberOfBoomerangs(int[][] points) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < points.length; i++) {
            map.clear();
            for (int j = 0; j < points.length; j++) {
                if (i == j)
                    continue;
                int x = (points[i][0] - points[j][0]) * (points[i][0] - points[j][0]);
                int y = (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
                int distance = x + y;
                // 因为可以换位，所以*2
                count += map.getOrDefault(distance, 0) * 2;
                map.put(distance, map.getOrDefault(distance, 0) + 1);
            }
        }
        return count;
    }
}
// @lc code=end

