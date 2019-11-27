/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        boolean carry = false;
        int p = num1.length() - 1;
        int q = num2.length() - 1;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        while (p >= 0 && q >= 0) {
            int a = Integer.parseInt(num1.charAt(p) + "");
            int b = Integer.parseInt(num2.charAt(q) + "");
            sum = a + b;
            if (carry) {
                sum += 1;
                carry = false;
            }
            if (sum >= 10) {
                carry = true;
                sum -= 10;
            }

            sb.append(sum);
            p--;
            q--;
        }

        while (p >= 0) {
            int a = Integer.parseInt(num1.charAt(p) + "");
            sum = a;
            if (carry) {
                sum += 1;
                carry = false;
            } 
            if (sum >= 10) {
                carry = true;
                sum -= 10;
            }
            p--;
            sb.append(sum);
        }

        while (q >= 0) {
            int a = Integer.parseInt(num2.charAt(q) + "");
            sum = a;
            if (carry) {
                sum += 1;
                carry = false;
            } 
            if (sum >= 10) {
                carry = true;
                sum -= 10;
            }
            q--;
            sb.append(sum);
        }

        if (carry) {
            sb.append("1");
        }

        return sb.reverse().toString();
    }
}
// @lc code=end

