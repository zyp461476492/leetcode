class Solution {
    public String replaceSpace(String s) {
        char[] oldStr = s.toCharArray();
        int zeroCount = 0;
        for (char c : oldStr) {
            if (c == ' ')
                zeroCount++;
        }
        
        if (zeroCount == 0)
            return s;

        char[] newStr = new char[oldStr.length + 2 * zeroCount];
        int i = 0, j = 0;
        for (; i < oldStr.length; i++) {
            char c = oldStr[i];
            if (c == ' ') {
                newStr[j++] = '%';
                newStr[j++] = '2';
                newStr[j++] = '0';
            } else {
                newStr[j++] = c;
            }
        }
        return new String(newStr);
    }
}