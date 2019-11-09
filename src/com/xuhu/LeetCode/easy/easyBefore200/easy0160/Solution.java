package com.xuhu.LeetCode.easy.easyBefore200.easy0160;

import com.xuhu.LeetCode.a.util.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //利用双指针法
        if(null == headA || null == headB){
            return null;
        }

        /**
         * 定义两个指针, 第一轮让两个到达末尾的节点指向另一个链表的头部, 最后如果相遇则为交点(在第一轮移动中恰好抹除了长度差)
         * 两个指针等于移动了相同的距离, 有交点就返回, 无交点就是各走了两条指针的长度
         */
        ListNode l1 = headA;
        ListNode l2 = headB;
        // 在这里第一轮体现在pA和pB第一次到达尾部会移向另一链表的表头, 而第二轮体现在如果pA或pB相交就返回交点, 不相交最后就是null==null
        while (l1 != l2){
            l1 = l1 == null ? headB : l1.next;
            l2 = l2 == null ? headA : l2.next;
        }
        return l1;
    }
}