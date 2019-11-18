/*
 * @lc app=leetcode.cn id=374 lang=java
 *
 * [374] 猜数字大小
 */

// @lc code=start
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int lo = 1;
        int hi = n;
        while (lo <= hi) {
            int mid = (lo + hi ) >>> 1;
            int res = guess(mid);
            if (res == -1) {
                hi = mid - 1;
            } else if (res == 1) {
                lo = mid + 1;
            } else if (res == 0) {
                return mid;
            }
        }
        return -1;
    }
}
// @lc code=end

