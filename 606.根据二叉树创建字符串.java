/*
 * @lc app=leetcode.cn id=606 lang=java
 *
 * [606] 根据二叉树创建字符串
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    StringBuilder sb = new StringBuilder();

    public String tree2str(TreeNode t) {
        core(t);
        return sb.toString();
    }

    public void core(TreeNode t) {
        if (t != null) {
            sb.append(t.val);
            if (t.left != null && t.right != null) {
                sb.append("(");
                core(t.left);
                sb.append(")");
                sb.append("(");
                core(t.right);
                sb.append(")");
            } else if (t.left == null && t.right != null) {
                sb.append("()");
                sb.append("(");
                core(t.right);
                sb.append(")");
            } else if (t.left != null && t.right == null) {
                sb.append("(");
                core(t.left);
                sb.append(")");
            }

        }
    }
}
// @lc code=end
