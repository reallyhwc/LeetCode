package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D26;


import com.sun.source.tree.Tree;
import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    //老规矩搞法
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> listAll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        method(root,sum,listAll,list);
        return listAll;
    }

    private void method(TreeNode root, int total, List<List<Integer>> listAll, List<Integer> list){
        if(root == null) return;

        int val = root.val;
        if(root.left == null && root.right == null){
            if(total == val){
                list.add(val);
                listAll.add(new ArrayList<>(list));
                list.remove(list.size()-1);
            }
            return;
        }

        if(root.left != null){
            list.add(val);
            method(root.left,total-val, listAll,list);
            list.remove(list.size()-1);
        }

        if(root.right != null){
            list.add(val);
            method(root.right,total-val, listAll,list);
            list.remove(list.size()-1);
        }
    }
}