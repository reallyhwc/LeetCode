package com.xuhu.LeetCode.mid.midBefore200.mid0109;

import com.xuhu.LeetCode.a.util.ListNode;
import com.xuhu.LeetCode.a.util.ListNodeUtil;
import com.xuhu.LeetCode.a.util.TreeOperation;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        TreeOperation.show(solution.sortedListToBST(ListNodeUtil.convertArrayToListNode(new int[]{-10, -3, 0, 5, 9})));
    }
}