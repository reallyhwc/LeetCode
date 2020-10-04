package com.xuhu.LeetCode.game.week.W2020_10_04.T02;

import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;
import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        TreeNode node = TreeUtils.create(new Integer[]{5,4,2,3,3,null,7},0);
        TreeNode node1 = TreeUtils.create(new Integer[]{1,10,4,3,null,7,9,12,8,null,null,6,null,null,2},0);
        TreeOperation.show(node1);
        TreeNode node2 = TreeUtils.create(new Integer[]{5,4,2,3,3,null,7},0);
        System.out.println(solution.isEvenOddTree(node));
        System.out.println(solution.isEvenOddTree(node1));
    }
}