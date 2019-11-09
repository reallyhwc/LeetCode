package com.xuhu.LeetCode.easy.easyBefore100.easy0083;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNode A1 = new ListNode(1);
        ListNode A2 = new ListNode(1);
        ListNode A3 = new ListNode(2);
        ListNode A4 = new ListNode(2);
        ListNode A5 = new ListNode(3);
        ListNode A6 = new ListNode(3);
        A5.next = A6;
        A4.next = A5;
        A3.next = A4;
        A2.next = A3;
        A1.next = A2;
        ListNode test = solution.deleteDuplicates(A1);
        while(test != null){
            System.out.println(test.val);
            test = test.next;
        }

    }
}