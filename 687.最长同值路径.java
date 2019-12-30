/*
 * @lc app=leetcode.cn id=687 lang=java
 *
 * [687] 最长同值路径
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
    int ans = 0;
    public int longestUnivaluePath(TreeNode root) {
        core(root);
        return ans;
    }

    public int core(TreeNode root) {
        if (root == null) return 0;
        int left = core(root.left);
        int right = core(root.right);
        int tempLeft = 0, tempRight = 0;
        if (root.left != null && root.val == root.left.val)
            tempLeft = left + 1;
        if (root.right != null && root.val == root.right.val)
            tempRight = right + 1;
        ans = Math.max(ans, tempLeft + tempRight);
        return Math.max(tempLeft, tempRight);
    }
}
// @lc code=end

