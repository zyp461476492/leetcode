/*
 * @lc app=leetcode.cn id=628 lang=java
 *
 * [628] 三个数的最大乘积
 */

// @lc code=start
class Solution {
    public int maximumProduct(int[] nums) {
        int maxa = Integer.MIN_VALUE,maxb = Integer.MIN_VALUE, maxc = Integer.MIN_VALUE;
        int mina = Integer.MAX_VALUE, minb = Integer.MAX_VALUE;
        
        for (int n : nums) {
            if (n > maxa) {
                maxc = maxb;
                maxb = maxa;
                maxa = n;
            } else if (n > maxb) {
                maxc = maxb;
                maxb = n;
            } else if (n > maxc) {
                maxc = n;
            }
            
            if (n < mina) {
                minb = mina;
                mina = n;
            } else if (n < minb) {
                minb = n;
            }
        }
        
        return Math.max(maxa*maxb*maxc, maxa*mina*minb);
    }
}
// @lc code=end

