import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=108 lang=java
 *
 * [108] 将有序数组转换为二叉搜索树
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    public TreeNode buildTree(int[] nums, int lo, int hi) {
        if (lo > hi) 
            return null;
        int mid = (lo + hi) >>> 1;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums, lo, mid - 1);
        root.right = buildTree(nums, mid + 1, hi);
        return root;
    }
}
// @lc code=end

