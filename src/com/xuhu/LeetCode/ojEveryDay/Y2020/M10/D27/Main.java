package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D27;

import com.xuhu.LeetCode.a.util.ListUtils;
import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.printLnList(solution.preorderTraversal(TreeUtils.create(new Integer[]{1,null,2,null,null,3},0)));
    }
}