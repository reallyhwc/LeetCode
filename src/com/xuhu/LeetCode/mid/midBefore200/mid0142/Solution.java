package com.xuhu.LeetCode.mid.midBefore200.mid0142;


import com.xuhu.LeetCode.a.util.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)return null;
        ListNode p1 = head;
        ListNode p2 = head;
        boolean hasCycle = false;
        while (p2.next != null && p2.next.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2){
                hasCycle = true;
                break;
            }
        }
        if(hasCycle){
            ListNode q = head;
            while (q != p1){
                q = q.next;
                p1 = p1.next;
            }
            return q;
        }else {
            return null;
        }
    }
}