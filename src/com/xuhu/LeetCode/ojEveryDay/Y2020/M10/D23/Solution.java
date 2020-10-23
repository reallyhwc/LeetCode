package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D23;


import com.xuhu.LeetCode.a.util.ListNode;

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null){
            return true;
        }
        ListNode headTarget = head;
        ListNode reverse = null;
        while (head != null){
            ListNode temp = new ListNode(head.val);
            temp.next = reverse;
            reverse = temp;
            head = head.next;
        }

        while (headTarget != null && reverse != null){
            if (headTarget.val != reverse.val){
                return false;
            }else {
                headTarget = headTarget.next;
                reverse = reverse.next;
            }
        }

        if (reverse != null || headTarget != null){
            return false;
        }
        return true;
    }
}