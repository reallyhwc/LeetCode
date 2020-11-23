package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D20;


import com.xuhu.LeetCode.a.util.ListNode;

import java.util.List;

class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode pre;
        dummy.next = head;
        while (head != null && head.next != null){
            if (head.val < head.next.val){
                head = head.next;
                continue;
            }
            pre = dummy;
            while (pre.next.val < head.next.val){
                pre = pre.next;
            }
            ListNode curr = head.next;
            head.next = curr.next;
            curr.next = pre.next;
            pre.next = curr;

        }

        return dummy.next;
    }
}