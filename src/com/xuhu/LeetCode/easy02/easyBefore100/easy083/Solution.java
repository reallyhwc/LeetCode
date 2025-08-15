package com.xuhu.LeetCode.easy02.easyBefore100.easy083;


import com.xuhu.LeetCode.a.util.ListNode;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        while (temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}