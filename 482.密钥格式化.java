/*
 * @lc app=leetcode.cn id=482 lang=java
 *
 * [482] 密钥格式化
 */

// @lc code=start
class Solution {
    public String licenseKeyFormatting(String S, int K) {
        S = S.toUpperCase();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c != '-') {
                list.add(c);
            }
        }
        
        if (list.size() == 0)
            return "";
        
        int headCount = list.size() % K == 0 ? K : list.size() % K;
        int start = 0;
        StringBuilder sb = new StringBuilder();
        for (;start < headCount; start++) {
            sb.append(list.get(start));
        }
        if (!(start == list.size()))
            sb.append("-");
        
        int count = 0;
        for (;start < list.size(); start++) {
            sb.append(list.get(start));
            count++;
            if (count == K && !(start + 1 == list.size())) {
                count = 0;
                sb.append("-");
            }
        }
        
        return sb.toString();
    }
}
// @lc code=end

