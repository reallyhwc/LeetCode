package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D08;

import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;
import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        TreeNode node = TreeUtils.create(new Integer[]{1,3,null,null,2},0);
        TreeOperation.show(node);
        solution.recoverTree(node);
        TreeOperation.show(node);
        System.out.println();
    }
}