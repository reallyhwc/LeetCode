package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D09;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.printLnLists(solution.combinationSum(new int[]{2,3,6,7},7));
        System.out.println("------------------------------------------------------");
        ListUtils.printLnLists(solution.combinationSum(new int[]{2,3,5},8));
    }
}