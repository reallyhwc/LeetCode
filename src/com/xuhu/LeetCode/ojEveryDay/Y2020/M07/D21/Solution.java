package com.xuhu.LeetCode.ojEveryDay.Y2020.M07.D21;


import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0){
            return new ArrayList<TreeNode> ();
        }
        return generateTreesByIndex(1,n);
    }

    private List<TreeNode> generateTreesByIndex(int start, int end){
        List<TreeNode> list = new ArrayList<>();
        if (start > end){
            list.add(null);
            return list;
        }
        for (int i = start; i <= end; i++){
            List<TreeNode> lefts = generateTreesByIndex(start,i-1);
            List<TreeNode> rights = generateTreesByIndex(i+1,end);
            for (TreeNode left : lefts){
                for (TreeNode right : rights) {
                    TreeNode node = new TreeNode(i);
                    node.left = left;
                    node.right = right;
                    list.add(node);
                }
            }
        }
        return list;
    }
}