package com.xuhu.LeetCode.easyBefore200.easy0021;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNode A1 = new ListNode(1);
        ListNode A2 = new ListNode(2);
        ListNode A4 = new ListNode(4);
        A2.next = A4;
        A1.next = A2;

        ListNode B1 = new ListNode(1);
        ListNode B3 = new ListNode(3);
        ListNode B4 = new ListNode(4);
        B3.next = B4;
        B1.next = B3;

        Method01(solution.mergeTwoLists(A1,B1));
    }

    public static void Method01(ListNode node){
        while (null != node){
            System.out.println(node.val);
            node = node.next;
        }
    }
}