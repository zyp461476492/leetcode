import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=437 lang=java
 *
 * [437] 路径总和 III
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
    public int pathSum(TreeNode root, int sum) {
        int count = 0;
        HashMap<Integer, Integer> pathMap = new HashMap<>();
        // 路径长度为0的目前有一个
        pathMap.put(0, 1);
        return core(root, pathMap, sum, 0);
    }

    public int core(TreeNode root, HashMap<Integer, Integer> pathMap, int sum, int curSum) {
        if (root == null) return 0;
        curSum = curSum + root.val;
        // n = sum - curSum n为符合要求的路径，查找它的数量
        int answer = pathMap.getOrDefault(curSum - sum, 0);
        // 把当前的路径放入
        pathMap.put(curSum, pathMap.getOrDefault(curSum, 0) + 1);
        answer += core(root.left, pathMap, sum, curSum);
        answer += core(root.right, pathMap, sum, curSum);
        // 把之前放入的弹出
        pathMap.put(curSum, pathMap.get(curSum) - 1);
        return answer;
    }

}
// @lc code=end

