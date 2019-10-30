/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
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
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode root = null;
        ListNode cur = head;
        ListNode next = head.next;
        while (cur != null) {
            cur.next = root;
            root = cur;
            cur = next;
            if (next != null)
                next = next.next;
        }
        return root;
    }
}
// @lc code=end

