class Solution {
    public int numWays(int n) {
        if (n <= 1) return 1;
        long[] dp = new long[2];
        dp[0] = 1;
        dp[1] = 1;
        long res = 0;
        for (int i = 2; i <= n; i++) {
            res = (dp[0] + dp[1]) % (1000000007);
            dp[0] = dp[1];
            dp[1] = res;
        }
        return (int) res;
    }
}