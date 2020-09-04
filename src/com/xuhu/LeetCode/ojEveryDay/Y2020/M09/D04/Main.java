package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D04;

import com.xuhu.LeetCode.a.util.ListUtils;
import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;
import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        TreeNode node = TreeUtils.create(new Integer[]{1,2,3,null,5},0);
        TreeOperation.show(node);
        ListUtils.pringlnList(solution.binaryTreePaths(node));
    }
}