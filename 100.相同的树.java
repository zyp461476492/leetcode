/*
 * @lc app=leetcode.cn id=100 lang=java
 *
 * [100] 相同的树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return center(p).equals(center(q));
    }

    public String center(TreeNode root) {
        if (root == null)
            return "null";
        String s = root.val + "";
        s += center(root.left);
        s += center(root.right);
        return s;
    }
}
// @lc code=end

