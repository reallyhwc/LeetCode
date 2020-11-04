package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D04;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.pringlnDoubleArrays(solution.insert(new int[][]{{1,3},{6,9}}, new int[]{2,5}));
        ListUtils.pringlnDoubleArrays(solution.insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4,8}));
    }
}