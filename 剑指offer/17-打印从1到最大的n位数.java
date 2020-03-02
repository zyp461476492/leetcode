class Solution {
    public int[] printNumbers(int n) {
        int base = 10, sum = 1;
        while (n != 0) {
            if ((n & 1) == 1)
                sum *= base;
            n = n >>> 1;
            base *= base;
        }

        int[] ans = new int[sum - 1];
        int i = 1;
        while (i < sum) {
            ans[i - 1] = i;
            i++;
        }
        return ans;
    }
}