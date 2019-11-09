package com.xuhu.LeetCode.easy.easyBefore200.easy0141;


import com.xuhu.LeetCode.a.util.ListNode;

public class Solution {
    //定义快慢指针，慢指针一次跳动一个，快指针一次跳动两个，如果快指针能够追上慢指针
    //说明肯定存在环形链表
    //注意要时刻判断一下快慢指针是否为null（如果任意一个出现了null的情况，说明不存在环）
    public boolean hasCycle(ListNode head) {
        if(null == head || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != null && fast != null){
            if(slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next;
            if(null != fast){
                fast = fast.next;
            }else{
                return false;
            }
        }
        return false;
    }
}