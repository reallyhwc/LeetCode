package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D21;

import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.minDepth(TreeUtils.create(new Integer[]{3,9,20,null,null,15,7},0)));
    }
}