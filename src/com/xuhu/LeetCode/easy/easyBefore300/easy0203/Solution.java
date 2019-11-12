package com.xuhu.LeetCode.easy.easyBefore300.easy0203;


import com.xuhu.LeetCode.a.util.ListNode;

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode result = temp;
        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return result.next;
    }
}