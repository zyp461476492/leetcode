/*
 * @lc app=leetcode.cn id=227 lang=java
 *
 * [227] 基本计算器 II
 */

// @lc code=start
import java.util.LinkedList;
import java.util.Stack;

class Solution {
    int[][] flag = { { 1, 1, 0, 0 }, { 1, 1, 0, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };

    HashMap<Character, Integer> map = new HashMap<>();

    public int calculate(String s) {
        map.put('+', 0);
        map.put('-', 1);
        map.put('*', 2);
        map.put('/', 3);

        Stack<Integer> numStack = new Stack<>();
        Stack<Character> opStack = new Stack<>();
        char[] array = s.toCharArray();
        List<String> exp = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            // 1.遇到了数字
            if (Character.isDigit(array[i])) {
                // 注意多位数的获取
                int k = i + 1;
                for (; k < array.length && Character.isDigit(array[k]); k++) {

                }
                exp.add(s.substring(i, k));
                i = k - 1;// 更新 i
                continue;
            }

            if (array[i] == ' ')
                continue;

            while (!opStack.isEmpty() && compare(opStack.peek(), array[i])) {
                exp.add(opStack.pop() + "");
            }
            opStack.push(array[i]);
        }

        while (!opStack.isEmpty()) {
            exp.add(opStack.pop() + "");
        }

        for (String c : exp) {
            if (isNumeric(c)) {
                numStack.push(Integer.parseInt(c));
            } else {
                int b = numStack.pop();
                int a = numStack.pop();
                numStack.push(calculate(a, b, c.toCharArray()[0]));
            }
        }
        return numStack.pop();
    }

    public int calculate(int a, int b, char op) {
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '*') {
            return a * b;
        } else {
            return a / b;
        }
    }

    public boolean compare(char a, char b) {
        int x = map.get(a);
        int y = map.get(b);
        return flag[x][y] > 0;
    }

    public static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

// @lc code=end
