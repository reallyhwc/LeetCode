package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D20;

import com.xuhu.LeetCode.a.util.ListNodeUtil;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNodeUtil.printListNode(solution.insertionSortList(ListNodeUtil.convertArrayToListNode(new int[]{4,2,1,3})));
    }
}