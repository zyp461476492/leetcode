class Solution {
    public int findRepeatNumber(int[] nums) {
        return solution1(nums);
    }

    /**
    * 解法1：用 Set，空间换时间 O(n) 复杂度
    */
    private int solution1(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int n : nums) {
            if (set.contains(n)) {
                return n;
            }
            set.add(n);
        }
        return -1;
    }
}