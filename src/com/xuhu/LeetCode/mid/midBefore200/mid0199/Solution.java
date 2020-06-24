package com.xuhu.LeetCode.mid.midBefore200.mid0199;


import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.*;

class Solution {

    /**
     * 参看别人题解思路 采用层序遍历 放入队列，每次取队列最后的一位放入返回List中即可
     * 试试
     * @param root
     * @return
     */
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++){
                TreeNode node = queue.remove();
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                if(i == size-1){
                    list.add(node.val);
                }
            }
        }
        return list;
    }

    /**
     * 个人解法-时间复杂度比较高
     * @param root
     * @return
     */
    public List<Integer> rightSideView1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        // 把根节点放入结果List
        // 并把根节点放入栈中
        // 栈stack中存放着当前层的上一层的结点
        stack.push(root);
        list.add(root.val);
        while (!stack.isEmpty()){
            // 定义布尔变量-当前层还为取最右边的值
            boolean flag = false;
            // tempStack 用作存储遍历的当前层结点（倒转后会放入stack供下一层使用）
            Stack<TreeNode> tempStack = new Stack<>();
            while (!stack.isEmpty()){
                TreeNode node = stack.pop();
                if(null != node.right){
                    if(!flag){
                        // 如果当前层还未取出最右的值，那么node.right.val 就是最右的值
                        list.add(node.right.val);
                        flag = true;
                    }
                    tempStack.add(node.right);
                }
                if(null != node.left){
                    if(!flag){
                        // 如果当前层还未取出最右的值，那么node.left.val 就是最右的值
                        list.add(node.left.val);
                        flag = true;
                    }
                    tempStack.add(node.left);
                }
            }
            if(!flag){
                break;
            }
            while (!tempStack.isEmpty()){
                stack.add(tempStack.pop());
            }
        }
        return list;
    }
}