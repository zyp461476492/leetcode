import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        if ("".equals(s))
            return true;
        if (s.length() < 2)
            return false;

        LinkedList<Character> stack = new LinkedList<>();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            switch (c) {
            case '(':
            case '{':
            case '[':
                stack.push(c);
                break;
            case ')':
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
                break;
            case '}':
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
                break;
            case ']':
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
                break;
            }
            i++;
        }
        return stack.isEmpty();
    }
}
// @lc code=end
