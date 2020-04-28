package com.xuhu.LeetCode.mid.midBefore100.mid0095;

import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        List<TreeNode> list = solution.generateTrees(3);
        for(TreeNode node : list){
            TreeOperation.show(node);
            System.out.println("----------------------------\n");
        }
        System.out.println();
    }
}