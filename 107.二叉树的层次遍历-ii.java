import java.util.Collections;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层次遍历 II
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            List<TreeNode> tempQueue = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode current = queue.poll();
                TreeNode left = current.left;
                TreeNode right = current.right;
                if (current != null) {
                    temp.add(current.val);
                    if (left != null)
                        tempQueue.add(current.left);
                    if (right != null)
                        tempQueue.add(current.right);
                }
            }
            list.add(temp);
            queue.addAll(tempQueue);
        }
        Collections.reverse(list);
        return list;
    }
}
// @lc code=end

