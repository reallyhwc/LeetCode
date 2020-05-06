package com.xuhu.LeetCode.mid.midBefore200.mid0113;

import com.xuhu.LeetCode.a.util.ListUtils;
import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;
import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        TreeNode node = TreeUtils.create(new Integer[]{-2,null,-3},0);
//        TreeOperation.show(node);
//        TreeNode node = TreeUtils.create(new Integer[]{5,4,8,11,null,13,4,7,2,null,null,null,null,5,1},0);
        ListUtils.printLnLists(solution.pathSum(node,-5));

    }
}