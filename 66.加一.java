/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        boolean carryFlag = true;
        int carry = 1;
        int i = digits.length - 1;
        int addResult = 0;
        while (i >= 0) {
            addResult = digits[i];
            if (carryFlag) {
                carryFlag = false;
                addResult += carry;
            }
            if (addResult < 10) {
                digits[i] = addResult;
                return digits;
            } else {
                carryFlag = true;
                digits[i] = addResult - 10;
            }
            i--;
        }
        
        if (carryFlag) {
            digits = resize(digits);
            digits[0] = carry;
        }
        
        return digits;
        
    }
    
    public int[] resize(int[] digits) {
        int[] newArray = new int[digits.length + 1];
        int index = 1;
        for (int i = 0; i < digits.length; i++) {
            newArray[index] = digits[i];
            index++;
        }
        return newArray;
    }
}
// @lc code=end

