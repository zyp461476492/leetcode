/*
 * @lc app=leetcode.cn id=236 lang=java
 *
 * [236] 二叉树的最近公共祖先
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
    TreeNode ans = null;
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        core(root, p, q);
        return ans;
    }
    
    public boolean core(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return false;
        int left = core(root.left, p, q) ? 1 : 0;
        int right = core(root.right, p, q) ? 1 : 0;
        int mid = ( root == p || root == q ) ? 1 : 0;
        if (left + right + mid >= 2) {
            this.ans = root;
        }
            
        return (left + right + mid ) > 0;
    }
}
// @lc code=end

