package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D23;


import com.xuhu.LeetCode.a.util.ListNode;

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null){
            return true;
        }

        ListNode headRecord = head;
        ListNode reverse = null;
        while (head != null){
            ListNode temp = new ListNode(head.val);
            temp.next = reverse;
            reverse = temp;
            head = head.next;
        }

        while (headRecord != null && reverse != null){
            if (headRecord.val != reverse.val){
                return false;
            }else {
                headRecord = headRecord.next;
                reverse = reverse.next;
            }
        }

        if (headRecord != null || reverse != null){
            return false;
        }

        return true;
    }
}