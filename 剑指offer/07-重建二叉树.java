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
    /**
    * 前序遍历确定根节点位置
    * 中序遍历确定左子树和右子树
    */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int[] inorder, int sPre, int ePre, int sIn, int eIn) {
        if (sPre > ePre || sIn > eIn)
            return null;
        int rootVal = preorder[sPre];
        TreeNode root = new TreeNode(rootVal);
        for (int i = sIn; i <= eIn; i++) {
            if (inorder[i] == rootVal) {
                int leftCount = i - sIn;
                int rightCount = eIn - i;
                root.left = helper(preorder, inorder, sPre + 1, sPre + leftCount, sIn, i - 1);
                root.right = helper(preorder, inorder, sPre + leftCount + 1, ePre, i + 1, eIn);
            }
        }
        return root;
    }
}