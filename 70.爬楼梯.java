/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        // 动态规划法
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    
    public int climbStairs(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n)
            return 1;
        
    
        return climbStairs(i + 1, n) + climbStairs(i + 2, n);
    }
    
    public int climbStairs(int i, int n, int[] memo) {
        if (i > n) {
            return 0;
        }
        
        if (i == n)
            return 1;
        
        if (memo[i] > 0)
            // 说明已经计算过了，直接读取
            return memo[i];
        // 没计算过
        memo[i] = climbStairs(i + 1, n, memo) + climbStairs(i + 2, n, memo);
        return memo[i];
    }
}
// @lc code=end

