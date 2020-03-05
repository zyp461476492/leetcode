class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int i = 0;
        int curNeed = 1;
        while (candies > 0) {
            if (i == num_people)
                i = 0;
            if (candies >= curNeed) {
                ans[i] += curNeed;
                candies -= curNeed;
            } else {
                ans[i] += candies;
                candies = 0;
            }
            i++;
            curNeed++;
        }
        return ans;
    }
}