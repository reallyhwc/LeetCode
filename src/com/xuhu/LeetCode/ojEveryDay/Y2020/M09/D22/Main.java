package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D22;

import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.minCameraCover(TreeUtils.create(new Integer[]{0,0,null,null,0,0},0)));
    }
}