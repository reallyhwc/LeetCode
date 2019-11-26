package com.xuhu.LeetCode.easy.easyBefore300.easy0234;

import com.xuhu.LeetCode.a.util.ListNode;

class Solution {
    //这里是直接翻转了整个链表存在了另外一块内存空间中
    //也可以利用快慢指针，仅翻转后半部分的链表
    //太麻烦懒得写了，思路清晰
    public boolean isPalindrome(ListNode head) {
        ListNode headRecord = head;
        if(head == null || head.next == null){
            return true;
        }
        ListNode result = null;
        while (head != null){
            ListNode temp = new ListNode(head.val);
            temp.next = result;
            result = temp;
            head = head.next;
        }
        while (result != null && headRecord != null){
            if(result.val == headRecord.val){
                result = result.next;
                headRecord = headRecord.next;
            }else{
                return false;
            }
        }
        if(result != null || headRecord != null){
            return false;
        }
        return true;
    }
}