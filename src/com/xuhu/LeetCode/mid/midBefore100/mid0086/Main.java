package com.xuhu.LeetCode.mid.midBefore100.mid0086;

import com.xuhu.LeetCode.a.util.ListNodeUtil;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNodeUtil.printListNode(solution.partition(ListNodeUtil.convertArrayToListNode(new int[]{1,4,3,2,5,2}),3));
    }
}