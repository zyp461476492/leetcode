/*
 * @lc app=leetcode.cn id=230 lang=java
 *
 * [230] 二叉搜索树中第K小的元素
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    int count = 0;
    int ans = 0;

    public int kthSmallest(TreeNode root, int k) {
        core(root, k);
        return ans;
    }

    public void core(TreeNode root, int k) {
        if (root != null && count <= k) {
            core(root.left, k);
            count++;
            if (count == k)
                ans = root.val;
            core(root.right, k);
        }
    }
}
// @lc code=end
