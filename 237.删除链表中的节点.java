/*
 * @lc app=leetcode.cn id=237 lang=java
 *
 * [237] 删除链表中的节点
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        while (node != null && node.next != null) {
            node.val = node.next.val;
            if (node.next.next == null)
                node.next = null;
            node = node.next;
        }
    }
}
// @lc code=end

