/*
 * @lc app=leetcode.cn id=371 lang=java
 *
 * [371] 两整数之和
 */

// @lc code=start
class Solution {
    public int getSum(int a, int b) {
        // 异或可以获得不进位的相加后的结果
        // 与操作可以获得进位结果
        // a 作为最后计算结果
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}
// @lc code=end

