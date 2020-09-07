package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D07;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.pringlnArrays(solution.topKFrequent(new int[]{1,1,1,2,2,3},2));
        ListUtils.pringlnArrays(solution.topKFrequent(new int[]{1},1));
    }
}