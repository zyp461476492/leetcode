/*
 * @lc app=leetcode.cn id=653 lang=java
 *
 * [653] 两数之和 IV - 输入 BST
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hashset = new HashSet<Integer>();
        return preOrder(root, hashset, k);
    }

    public boolean preOrder(TreeNode root, HashSet<Integer> hashset, int k) {
        if (root == null)
            return false;
        if (hashset.contains(k - root.val)) {
            return true;
        }
        hashset.add(root.val);
        return preOrder(root.left, hashset, k) || preOrder(root.right, hashset, k);
    }
}
// @lc code=end
