package com.xuhu.LeetCode.easy.easyBefore100.easy0083;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        //看代码应该可以很快速的了解与原理，如果当前值与next的值相同，则跳过这个（通过迭代）
        if(head.val == head.next.val){
            head = deleteDuplicates(head.next);
        }else{
            head.next = deleteDuplicates(head.next);
        }
        return head;
    }
}