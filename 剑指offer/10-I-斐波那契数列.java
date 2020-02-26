class Solution {
    public int fib(int n) {
        if (n <= 1)
            return n;
        long one = 0;
        long two = 1;
        long sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = (one + two) % (1000000007);
            one = two;
            two = sum;
        }

        return (int) sum;
    }
}