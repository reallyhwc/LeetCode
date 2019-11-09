package com.xuhu.LeetCode.easyBefore200.easy0107;

import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        //新建一个LinkedList 用作返回值
        LinkedList<List<Integer>> lists = new LinkedList<>();
        if(root == null){
            return lists;
        }
        //定义一个队列，用来存储当前层结点
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        //只要当前层结点不为空
        //说明整个树还没有遍历完
        while (!queue.isEmpty()){
            //定义一个List用作存储当前层的结点的值
            List<Integer> oneLevel = new ArrayList<>();
            //遍历当前层结点，注意，要提前把队列的长度取出来，因为后面还会往队列里面追加值，只取之前的就好了
            int count = queue.size();
            //执行队列的取值操作，取count次，也就是，把当前层的结点都取完
            //并把当前层的每个结点的值，填充进list中去
            //并把当前结点的左右子节点填充进队列中（不为空的情况）作为下一层的结点
            for(int i = 0; i < count; i++){
                TreeNode temp = queue.poll();
                oneLevel.add(temp.val);
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
            lists.addFirst(oneLevel);
        }
        return lists;
    }
}