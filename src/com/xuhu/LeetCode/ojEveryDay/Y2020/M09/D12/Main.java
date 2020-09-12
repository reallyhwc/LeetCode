package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D12;

import com.xuhu.LeetCode.a.util.ListUtils;
import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.printLnList(solution.averageOfLevels(TreeUtils.create(new Integer[]{3,9,20,null,null,15,7},0)));
    }
}