package com.xuhu.LeetCode.mid.midBefore200.mid0143;


import com.xuhu.LeetCode.a.util.ListNode;

class Solution {
    // 先把链表分两半，翻转后一半，然后前后合并
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        ListNode p1 = head;
        ListNode p2 = head;
        // 慢指针的前一个结点 用作断开链表
        ListNode pre = head;
        while (p1!= null && p1.next != null){
            p1 = p1.next.next;
            pre = p2;
            p2 = p2.next;
        }

        pre.next = null;

        // 反转后面的链表
        ListNode newHead = null;
        while (p2 != null){
            p1 = p2;
            p2 = p2.next;
            p1.next = newHead;
            newHead = p1;
        }

        // 合并链表
        p1 = head;
        p2 = newHead;
        ListNode tmp = p1;
        while (p1 != null){
            tmp = p1;
            p1 = p1.next;
            tmp.next = p2;
            tmp = p2;
            p2 = p2.next;
            if(p1 != null){
                tmp.next = p1;
            }
        }
    }
}