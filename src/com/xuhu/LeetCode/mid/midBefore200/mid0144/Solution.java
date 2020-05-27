package com.xuhu.LeetCode.mid.midBefore200.mid0144;


import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(null == root) return ans;
        Stack<TreeNode> stack = new Stack<>();
        while (null != root){
            ans.add(root.val);
            if(null != root.right) stack.add(root.right);
            if(null != root.left){
                root = root.left;
                continue;
            }
            if(!stack.isEmpty()){
                root = stack.pop();
            }else {
                break;
            }
        }
        return ans;
    }
}