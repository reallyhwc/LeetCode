package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D09;


import com.xuhu.LeetCode.a.util.ListNode;

public class Solution {
    // 测试用例不太好写 就这样了
    // 具体实现就是使用快慢指针，快的一次跑两格，慢的一次跑一格，
    // 如果存在环路，必定快的会追上慢的
    // 否则，会出现抵达链表结尾的情况
    public boolean hasCycle(ListNode head) {
        if (null == head || head.next == null){
            return false;
        }
        ListNode p1 = head;
        ListNode p2 = head.next;
        while (p1 != null && p2 != null){
            if (p1 == p2){
                return true;
            }else {
                p1 = p1.next;
                p2 = p2.next;
                if (p2 != null){
                    p2 = p2.next;
                }else {
                    return false;
                }
            }
        }
        return false;
    }
}