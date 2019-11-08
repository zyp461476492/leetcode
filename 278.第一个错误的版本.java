/*
 * @lc app=leetcode.cn id=278 lang=java
 *
 * [278] 第一个错误的版本
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (isBadVersion(mid)) {
                // [left, mid] 去寻找是否存在最小的错误
                right = mid;
            } else {
                // [mid + 1, right] 中去寻找是否存在最小的错误
                left = mid + 1;
            }
        }
        return left;
    }
}
// @lc code=end

