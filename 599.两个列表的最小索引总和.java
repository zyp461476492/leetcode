/*
 * @lc app=leetcode.cn id=599 lang=java
 *
 * [599] 两个列表的最小索引总和
 */

// @lc code=start
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, String[]> sumMap = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            String s = list2[i];
            if (map.containsKey(s)) {
                int sum = map.get(s) + i;
                min = Math.min(min, sum);
                if (sumMap.containsKey(sum)) {
                    String[] oldSame = sumMap.get(sum);
                    String[] newSame = Arrays.copyOf(oldSame, oldSame.length + 1);
                    newSame[newSame.length - 1] = s;
                    sumMap.put(sum, newSame);
                } else {
                    String[] same = new String[1];
                    same[0] = s;
                    sumMap.put(sum, same);
                }
            }
        }
        return sumMap.get(min);
    }
}
// @lc code=end
