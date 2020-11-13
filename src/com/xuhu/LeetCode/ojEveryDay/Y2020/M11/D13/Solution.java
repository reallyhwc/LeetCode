package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D13;


import com.xuhu.LeetCode.a.util.ListNode;

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode start = head;
        ListNode mid = head.next;
        ListNode pre = head.next;
        ListNode end = head.next.next;

        while (end != null){
            start.next = end;
            pre.next = end.next;
            end.next = mid;

            start = start.next;
            pre = pre.next;
            if (null != pre && null != pre.next){
                end = pre.next;
            }else {
                break;
            }
        }

        return head;
    }
}