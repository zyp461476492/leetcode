import java.util.List;

/*
 * @lc app=leetcode.cn id=590 lang=java
 *
 * [590] N叉树的后序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    List<Integer> res = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if (root != null) {
            List<Node> children = root.children;
            if (children != null) {
                for (Node child : children) {
                    postorder(child);
                }
            }
            res.add(root.val);
        }
        return res;
    }
}
// @lc code=end

