/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(-1);
        ListNode p = root;
        while (l1 != null && l2 != null) {
            int min = l1.val;
            if (l1.val < l2.val) {
                l1 = l1.next;
            } else {
                min = l2.val;
                l2 = l2.next;
            }

            ListNode node = new ListNode(min);
            p.next = node;
            p = node;
        }

        last(p, l1);
        last(p, l2);

        return root.next;
    }

    public void last(ListNode p, ListNode target) {
        while (target != null) {
            ListNode node = new ListNode(target.val);
            p.next = node;
            p = node;
            target = target.next;
        }
    }
}
// @lc code=end
