package com.xuhu.LeetCode.ojEveryDay.Y2020.M12.D22;

import com.xuhu.LeetCode.a.util.ListUtils;
import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.printLnLists(solution.zigzagLevelOrder(TreeUtils.create(new Integer[]{3,9,20,null,null,15,7},0)));
    }
}