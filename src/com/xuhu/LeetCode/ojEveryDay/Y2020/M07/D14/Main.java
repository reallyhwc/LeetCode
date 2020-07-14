package com.xuhu.LeetCode.ojEveryDay.Y2020.M07.D14;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.minimumTotal(ListUtils.createDoubleListByDoubleArray(new Integer[][]{{2},{3,4},{6,5,7},{4,1,8,3}})));
    }
}