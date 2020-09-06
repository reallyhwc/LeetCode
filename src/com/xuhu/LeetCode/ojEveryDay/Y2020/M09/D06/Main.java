package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D06;

import com.xuhu.LeetCode.a.util.ListUtils;
import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.printLnLists(solution.levelOrderBottom(TreeUtils.create(new Integer[]{3,9,20,null,null,15,7},0)));
    }
}