package com.xuhu.LeetCode.mid.midBefore200.mid0116;


import com.xuhu.LeetCode.a.common.Node;

import java.util.LinkedList;
import java.util.Queue;

class Solution {

    public Node connect(Node root) {
        if(root == null || root.left == null) return root;

        root.left.next = root.right;
        if(root.next != null){
            root.right.next = root.next.left;
        }

        connect(root.left);
        connect(root.right);

        return  root;
    }

    // 时间复杂度较慢
    public Node connect1(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if(root == null || (root.left == null && root.right == null)){
            return root;
        }
        int nowSize = 1;
        queue.add(root);
        while (!queue.isEmpty() && nowSize != 0){
            int temp = 0;
            for(int i = 0; i < nowSize; i++){
                Node tempNode = queue.poll();
                if(i != nowSize-1){
                    tempNode.next = queue.peek();
                }
                if(null != tempNode.left){
                    queue.add(tempNode.left);
                    temp++;
                }
                if(null != tempNode.right){
                    queue.add(tempNode.right);
                    temp++;
                }
            }
            nowSize = temp;
        }
        return root;
    }
}