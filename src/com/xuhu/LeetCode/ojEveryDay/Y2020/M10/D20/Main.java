package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D20;

import com.xuhu.LeetCode.a.util.ListNode;
import com.xuhu.LeetCode.a.util.ListNodeUtil;
import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNode node = ListNodeUtil.convertArrayToListNode(new int[]{1,2,3,4,5});
        ListNodeUtil.printListNode(node);
        System.out.println("-------------------------");
        solution.reorderList(node);
        ListNodeUtil.printListNode(node);
    }
}