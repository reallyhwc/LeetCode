package com.xuhu.LeetCode.mid.midBefore200.mid0103;

import com.xuhu.LeetCode.a.util.ListUtils;
import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;
import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        TreeNode node = TreeUtils.create(new Integer[]{3,9,20,null,null,15,7},0);
        TreeOperation.show(node);
        ListUtils.printLnLists(solution.zigzagLevelOrder(node));
    }
}