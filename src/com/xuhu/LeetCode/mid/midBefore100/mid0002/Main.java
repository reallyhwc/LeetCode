package com.xuhu.LeetCode.mid.midBefore100.mid0002;

import com.xuhu.LeetCode.a.util.ListNode;
import com.xuhu.LeetCode.a.util.ListNodeUtil;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNodeUtil.printListNode(solution.addTwoNumbers(ListNodeUtil.convertArrayToListNode(new int[]{2,4,3}),ListNodeUtil.convertArrayToListNode(new int[]{5,6,9})));
    }
}