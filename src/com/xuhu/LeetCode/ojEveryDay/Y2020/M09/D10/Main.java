package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D10;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.printLnLists(solution.combinationSum2(new int[]{10,1,2,7,6,1,5},8));
        System.out.println("--------------------------------------------------------------");
        ListUtils.printLnLists(solution.combinationSum2(new int[]{2,5,2,1,2},5));
    }
}