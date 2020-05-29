package com.xuhu.LeetCode.mid.midBefore200.mid0148;

import com.xuhu.LeetCode.a.util.ListNodeUtil;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNodeUtil.printListNode(solution.sortList(ListNodeUtil.convertArrayToListNode(new int[]{4,2,1,3})));
    }
}