package com.xuhu.LeetCode.mid.midBefore100.mid0024;

import com.xuhu.LeetCode.a.util.ListNodeUtil;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNodeUtil.printListNode(solution.swapPairs(ListNodeUtil.convertArrayToListNode(new int[]{1,2,3,4,5})));
    }
}