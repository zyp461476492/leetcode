import java.util.ArrayList;
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 */

// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : nums1) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }

        for (int n : nums2) {
            if (map.containsKey(n)) {
                int cnt = map.get(n);
                cnt--;
                list.add(n);
                if (cnt == 0) map.remove(n);
                else map.put(n, cnt);
            }
        }

        int[] res = new int[list.size()];
        int idx = 0;
        for (int n : list) {
            res[idx++] = n;
        }

        return res;
    }
}
// @lc code=end

