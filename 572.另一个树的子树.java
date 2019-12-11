/*
 * @lc app=leetcode.cn id=572 lang=java
 *
 * [572] 另一个树的子树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null)
            return true;
        if (s == null || t == null)
            return false;
        if (s.val == t.val)
            return isEqual(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    public boolean isEqual(TreeNode s, TreeNode t) {
        // 两个树均空时，自然为相等
        if (s == null && t == null)
            return true;
        if (s == null || t == null)
            return false;
        if (s.val == t.val) {
            return isEqual(s.left, t.left) && isEqual(s.right, t.right);
        }
        return false;
    }
}
// @lc code=end
