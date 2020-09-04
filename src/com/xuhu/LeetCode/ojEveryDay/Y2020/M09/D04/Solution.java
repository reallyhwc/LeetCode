package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D04;


import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        if (root == null) {
            return paths;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        Queue<String> pathQueue = new LinkedList<String>();

        nodeQueue.offer(root);
        pathQueue.offer(Integer.toString(root.val));

        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.poll();
            String path = pathQueue.poll();

            if (node.left == null && node.right == null) {
                paths.add(path);
            } else {
                if (node.left != null) {
                    nodeQueue.offer(node.left);
                    pathQueue.offer(new StringBuffer(path).append("->").append(node.left.val).toString());
                }

                if (node.right != null) {
                    nodeQueue.offer(node.right);
                    pathQueue.offer(new StringBuffer(path).append("->").append(node.right.val).toString());
                }
            }
        }
        return paths;
    }



    public List<String> binaryTreePaths1(TreeNode root) {
        List<String> list = new ArrayList<>();
        bfs(root,list,"");
        return list;
    }

    private void bfs(TreeNode node,List<String> list, String str){
        if (node == null){
            return;
        }
        str += node.val;
        if (node.left == null && node.right == null){
            list.add(str);
        }else {
            bfs(node.left,list,str + "->");
            bfs(node.right, list, str + "->");
        }
    }
}