package com.xuhu.LeetCode.mid.midBefore100.mid0095;


import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<TreeNode> generateTrees(int n) {
        if(n == 0) return new ArrayList<>();

        return method(1,n);
    }

    private List<TreeNode> method(int start, int end){
        List<TreeNode> ans = new ArrayList<>();
        if(start > end){
            ans.add(null);
            return ans;
        }

        for(int i = start; i <= end; i++){
            List<TreeNode> leftNodes = method(start,i-1);
            List<TreeNode> rightNodes = method(i+1, end);
            for(TreeNode left : leftNodes){
                for(TreeNode right : rightNodes){
                    TreeNode node = new TreeNode(i);
                    node.left = left;
                    node.right = right;
                    ans.add(node);
                }
            }
        }
        return ans;
    }
}