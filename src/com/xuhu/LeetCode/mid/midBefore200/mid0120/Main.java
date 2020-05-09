package com.xuhu.LeetCode.mid.midBefore200.mid0120;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
//        ListUtils.printLnLists(ListUtils.createDoubleListByDoubleArray(new Integer[][]{{1},{2,3},{4,5,6},{7,8,9,10}}));
        System.out.println(solution.minimumTotal(ListUtils.createDoubleListByDoubleArray(new Integer[][]{{2},{3,4},{6,5,7},{4,1,8,3}})));
    }
}