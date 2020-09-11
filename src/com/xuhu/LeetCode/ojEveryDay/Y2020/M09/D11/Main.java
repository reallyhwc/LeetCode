package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D11;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.printLnLists(solution.combinationSum3(3,7));
        System.out.println("-------------------------------------");
        ListUtils.printLnLists(solution.combinationSum3(3,9));
    }
}