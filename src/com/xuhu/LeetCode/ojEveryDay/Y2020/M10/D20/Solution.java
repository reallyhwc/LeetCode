package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D20;


import com.xuhu.LeetCode.a.util.ListNode;

class Solution {
    public void reorderList(ListNode head) {
        // 思路 首先找出链表中点 然后拆分
        // 反转后半截链表 然后再合并链表
        if (head == null){
            return;
        }
        ListNode mid = getMidListNode(head);
        ListNode l1 = head;
        ListNode l2 = mid.next;
        mid.next = null;
        l2 = reverseListNode(l2);
        mergeList(l1,l2);
    }

    public ListNode reverseListNode(ListNode node){
        ListNode pre = null;
        ListNode cur = node;
        while (cur != null){
            ListNode tempNext = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tempNext;
        }
        return pre;
    }

    public ListNode getMidListNode(ListNode node){
        if (node == null || node.next == null){
            return node;
        }
        ListNode p1 = node;
        ListNode p2 = node;
        while (p2 != null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return p1;

    }

    public void mergeList(ListNode l1, ListNode l2) {
        ListNode l1_tmp;
        ListNode l2_tmp;
        while (l1 != null && l2 != null) {
            l1_tmp = l1.next;
            l2_tmp = l2.next;

            l1.next = l2;
            l1 = l1_tmp;

            l2.next = l1;
            l2 = l2_tmp;
        }
    }
}