import java.util.ArrayList;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i : nums1) {
            set.add(i);
        }

        for (int i : nums2) {
            if (set.contains(i)) {
                set.remove(i);
                res.add(i);
            }
        }

        int[] list = new int[res.size()];
        int i = 0;
        for (int n : res) {
            list[i++] = n;
        }
        return list;
    }
}
// @lc code=end

