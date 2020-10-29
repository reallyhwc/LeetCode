package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D29;

import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.sumNumbers(TreeUtils.create(new Integer[]{1,2,3},0)));
        System.out.println(solution.sumNumbers(TreeUtils.create(new Integer[]{4,9,0,5,1},0)));
    }
}