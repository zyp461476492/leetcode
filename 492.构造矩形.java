/*
 * @lc app=leetcode.cn id=492 lang=java
 *
 * [492] 构造矩形
 */

// @lc code=start
class Solution {
    public int[] constructRectangle(int area) {
        int[] res = new int[2];
        int W = 1;
        int L = area;
        int min = Integer.MAX_VALUE;
        while (L >= W) {
            int curArea = L * W;
            int sub = L - W;
            if (curArea == area) {
                if (sub <= min) {
                    res[0] = L;
                    res[1] = W;
                }
                L--;
                W++;
            } else if (curArea > area) {
                L--;
            } else if (curArea < area) {
                W++;
            } 
        }
        return res;
    }
}
// @lc code=end

