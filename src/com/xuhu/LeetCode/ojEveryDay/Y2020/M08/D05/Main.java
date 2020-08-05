package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D05;

import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.rob(TreeUtils.create(new Integer[]{3,2,3,null,3,null,1},0)));
        System.out.println(solution.rob(TreeUtils.create(new Integer[]{3,4,5,1,3,null,1},0)));
        System.out.println(solution.rob(TreeUtils.create(new Integer[]{4,1,null,2,null,null,null,3},0)));
    }
}