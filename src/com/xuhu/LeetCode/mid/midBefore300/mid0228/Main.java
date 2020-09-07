package com.xuhu.LeetCode.mid.midBefore300.mid0228;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.printList(solution.summaryRanges(new int[]{0,1,2,4,5,7}));
        System.out.println("-----------------");
        ListUtils.printList(solution.summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }
}