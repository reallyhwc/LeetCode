package com.xuhu.LeetCode.mid.midBefore400.mid0328;

import com.xuhu.LeetCode.a.util.ListNode;
import com.xuhu.LeetCode.a.util.ListNodeUtil;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNode node = ListNodeUtil.convertArrayToListNode(new int[]{1,2,3,4,5,6,7,8,9});
//        ListNodeUtil.printListNode(node);
        ListNodeUtil.printListNode(solution.oddEvenList(node));
    }
}