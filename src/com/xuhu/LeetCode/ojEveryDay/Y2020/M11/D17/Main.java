package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D17;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.pringlnDoubleArrays(solution.allCellsDistOrder(1,2,0,0));
        ListUtils.pringlnDoubleArrays(solution.allCellsDistOrder(2,2,0,1));
    }
}