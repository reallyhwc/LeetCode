package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D02;

import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;
import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        TreeNode node = TreeUtils.create(new Integer[]{1,2,5,3,4,null,6},0);
        TreeOperation.show(node);
        solution.flatten(node);
        TreeOperation.show(node);
    }
}