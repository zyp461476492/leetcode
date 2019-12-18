/*
 * @lc app=leetcode.cn id=617 lang=java
 *
 * [617] 合并二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode root = null;
        if (t1 != null)
            root = t1;
        if (t2 != null)
            root = t2;
        core(t1, t2);
        return root;
    }

    public void core(TreeNode t1, TreeNode t2) {
        if (t1 != null && t2 != null) {
            int sum = t1.val + t2.val;
            t1.val = sum;
            t2.val = sum;
            core(t1.left, t2.left);
            if (t1.left == null)
                t1.left = t2.left;
            if (t2.left == null)
                t2.left = t1.left;
            core(t1.right, t2.right);
            if (t1.right == null)
                t1.right = t2.right;
            if (t2.right == null)
                t2.right = t1.right;
        }
    }

}
// @lc code=end
