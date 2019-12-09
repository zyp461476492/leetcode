/*
 * @lc app=leetcode.cn id=557 lang=java
 *
 * [557] 反转字符串中的单词 III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        int i = 0;
        int begin = 0;
        int end = 0;
        char[] array = s.toCharArray();
        while (i < array.length) {
            begin = i;
            while (i < array.length && array[i] != ' ') i++;
            end = i - 1;
            while (begin < end) {
                char temp = array[end];
                array[end] = array[begin];
                array[begin] = temp;
                begin++;
                end--;
            }
            i++;
        }
        return new String(array);
    }
}
// @lc code=end

