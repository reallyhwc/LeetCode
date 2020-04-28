package com.xuhu.LeetCode.mid.midBefore200.mid0103;


import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> listAll = new ArrayList<>();
        method(listAll,root,0);
        return listAll;
    }

    private void method(List<List<Integer>> listAll, TreeNode root, int level){
        if(root == null) return;

        if(listAll.size() == level){
            listAll.add(new ArrayList<>());
        }

        if((level & 1) == 1){
            listAll.get(level).add(0,root.val);
        }else {
            listAll.get(level).add(root.val);
        }
        method(listAll,root.left,level+1);
        method(listAll,root.right,level+1);
    }
}