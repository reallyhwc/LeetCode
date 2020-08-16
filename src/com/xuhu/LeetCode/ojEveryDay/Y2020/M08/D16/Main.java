package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D16;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.pringlnDoubleArrays(solution.floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}},1,1,2));
    }
}