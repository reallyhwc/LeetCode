package com.xuhu.LeetCode.easyBefore200.easy0021;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(-999);
        ListNode result = temp;
        while( null != l1 && null != l2){
            if(l1.val < l2.val){
                ListNode listNode = new ListNode(l1.val);
                temp.next = listNode;
                temp = temp.next;
                l1 = l1.next;
            }else{
                ListNode listNode = new ListNode(l2.val);
                temp.next = listNode;
                temp = temp.next;
                l2 = l2.next;
            }
        }
        if(null != l1){
            temp.next = l1;
        }
        if(null != l2){
            temp.next = l2;
        }
        return result.next;
    }
}