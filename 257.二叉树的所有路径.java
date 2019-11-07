import java.util.List;

/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) return paths;
        getPath(root, "", paths);
        return paths;
    }

    public void getPath(TreeNode root, String s, List<String> paths) {
        if (root != null) {
            s += Integer.toString(root.val);
            if (root.left == null && root.right == null) {
                // 叶子节点
                paths.add(s);
            } else {
                s += "->";
                getPath(root.left, s, paths);
                getPath(root.right, s, paths);
            }
        }
    }
}
// @lc code=end

