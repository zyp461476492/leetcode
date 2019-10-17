/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public int maxDepthIteration(TreeNode tree) {
        Queue<Pair> q = new LinkedList<>();
        int depth = 0;
        q.offer(new Pair(tree, 1));
        while (!q.isEmpty()) {
            Pair current = q.poll();
            TreeNode root = current.node;
            int h = current.depth;
            if (root != null) {
                depth = Math.max(depth, h);
                q.offer(new Pair(root.left, h + 1));
                q.offer(new Pair(root.right, h + 1));
            }
        }
        return depth;
    }
}
// @lc code=end

