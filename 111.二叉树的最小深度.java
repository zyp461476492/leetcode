/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int minD = Integer.MAX_VALUE;
        if (root.left != null) {
            minD = Math.min(minDepth(root.left), minD);
        }
        
        if (root.right != null) {
            minD = Math.min(minDepth(root.right), minD);
        }
        
        return 1 + minD;
    }
}
// @lc code=end

