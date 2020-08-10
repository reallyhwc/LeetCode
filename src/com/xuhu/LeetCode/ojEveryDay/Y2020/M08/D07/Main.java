package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D07;

import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.isSameTree(TreeUtils.create(new Integer[]{1,2,3},0)
                ,TreeUtils.create(new Integer[]{1,2,4},0)));
    }
}