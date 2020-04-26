package com.xuhu.LeetCode.mid.midBefore100.mid0082;


import com.xuhu.LeetCode.a.util.ListNode;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode ans = new ListNode(-1);
        ans.next = head;

        if(head.val != head.next.val){
            head.next = deleteDuplicates(head.next);
        }else {
            while (head.next != null && head.val == head.next.val){
                head = head.next;
            }
            ans.next = deleteDuplicates(head.next);
        }

        return ans.next;
    }
}