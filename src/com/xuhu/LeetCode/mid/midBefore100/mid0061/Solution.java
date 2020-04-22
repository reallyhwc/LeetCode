package com.xuhu.LeetCode.mid.midBefore100.mid0061;


import com.xuhu.LeetCode.a.util.ListNode;

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;
        int length = 1;
        ListNode end = head;
        while (end.next != null){
            length++;
            end = end.next;
        }
        ListNode result = new ListNode(-1);
        result.next = head;
        k = (length - (k % length));
        while (k > 0){
            end.next = new ListNode(result.next.val);
            end = end.next;
            result = result.next;
            k--;
        }

        return result.next;
    }
}