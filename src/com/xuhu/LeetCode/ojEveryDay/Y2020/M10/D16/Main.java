package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D16;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.pringlnArrays(solution.sortedSquares(new int[]{-4,-1,0,3,10}));
        ListUtils.pringlnArrays(solution.sortedSquares(new int[]{-7,-3,2,3,11}));
    }
}