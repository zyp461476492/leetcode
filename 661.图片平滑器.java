/*
 * @lc app=leetcode.cn id=661 lang=java
 *
 * [661] 图片平滑器
 */

// @lc code=start
class Solution {
    public int[][] imageSmoother(int[][] M) {
        int iBorder = M.length;
        int jBorder = M[0].length;
        int[][] ans = new int[iBorder][jBorder];
        for (int i = 0; i < iBorder; i++) {
            for (int j = 0; j < jBorder; j++) {
                int sum = 0;
                int count = 0;
                for (int ni = i - 1; ni <= i + 1; ni++) {
                    for (int nj = j - 1; nj <= j + 1; nj++) {
                        if (ni >= 0 && ni < iBorder && nj >= 0 && nj < jBorder) {
                            count++;
                            sum += M[ni][nj];
                        }
                    }
                }
                ans[i][j] = sum / count;
            }
        }
        return ans;
    }
}
// @lc code=end
