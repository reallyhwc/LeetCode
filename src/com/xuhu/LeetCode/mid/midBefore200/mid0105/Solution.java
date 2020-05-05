package com.xuhu.LeetCode.mid.midBefore200.mid0105;


import com.sun.source.tree.Tree;
import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {

    private int pre = 0;
    private int in = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder,inorder,Integer.MAX_VALUE+1);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder,long stop){
        //如果前序遍历扫描到末尾，则返回null（已经结束）
        if(pre == preorder.length){
            return null;
        }

        //中序遍历序列数组顺序值等于终止值，则依次后移
        //表示此节点为空
        if(inorder[in] == stop){
            in++;
            return null;
        }

        //按照先序遍历顺序值新建节点
        int val = preorder[pre++];
        TreeNode root = new TreeNode(val);

        root.left = buildTree(preorder,inorder,val);
        root.right = buildTree(preorder,inorder,stop);

        return root;


    }


    //以下是自己的写法 时间较慢，注释掉
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        return method(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
//    }
//
//    private TreeNode method(int[] preorder, int[] inorder, int p_start, int p_end, int i_start, int i_end){
//        if(p_start > p_end || i_start > i_end){
//            return null;
//        }
//        if(p_start == p_end){
//            TreeNode node = new TreeNode(preorder[p_start]);
//            return node;
//        }
//
//        int i = 0;
//        while (p_start + i <= p_end){
//            if(preorder[p_start] == inorder[i_start+i]){
//                TreeNode node = new TreeNode(preorder[p_start]);
//                node.left = method(preorder,inorder,p_start+1,p_start+i,i_start,i_start+i-1);
//                node.right = method(preorder,inorder,p_start+i+1,p_end,i_start+i+1,i_end);
//                return node;
//            }else {
//                i++;
//            }
//        }
//        return null;
//    }
}