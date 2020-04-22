package com.xuhu.LeetCode.mid.midBefore100.mid0061;

import com.xuhu.LeetCode.a.util.ListNode;
import com.xuhu.LeetCode.a.util.ListNodeUtil;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNode node = ListNodeUtil.convertArrayToListNode(new int[]{0,1,2});
        ListNodeUtil.printListNode(node);
        System.out.print("-------------------\n");
        ListNodeUtil.printListNode(solution.rotateRight(node,4));

    }
}