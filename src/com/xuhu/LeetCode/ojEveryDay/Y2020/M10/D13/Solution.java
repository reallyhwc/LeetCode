package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D13;


import com.xuhu.LeetCode.a.util.ListNode;

class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode ans = head.next;
        head.next = swapPairs(ans.next);
        ans.next = head;
        return ans;
    }
}