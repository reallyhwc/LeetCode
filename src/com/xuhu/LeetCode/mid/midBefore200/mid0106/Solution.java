package com.xuhu.LeetCode.mid.midBefore200.mid0106;


import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {

    private int ino;
    private int pos;

    //参考题目 105
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        ino = inorder.length-1;
        pos = postorder.length-1;
        return build(inorder,postorder,Integer.MAX_VALUE+1);

    }

    private TreeNode build(int[] inorder, int[] postorder, long stop){
        if(pos < 0){
            return null;
        }

        if(inorder[ino] == stop){
            ino--;
            return null;
        }

        int val = postorder[pos--];
        TreeNode node = new TreeNode(val);
        node.right = build(inorder,postorder,val);
        node.left = build(inorder,postorder,stop);
        return node;
    }

//    public TreeNode buildTree1(int[] inorder, int[] postorder) {
//        return method(inorder,postorder,0,inorder.length-1, 0,postorder.length-1);
//    }
//
//    private TreeNode method(int[] inorder, int[] postorder, int i_start, int i_end, int p_start, int p_end){
//        if(p_start > p_end || i_start > i_end){
//            return null;
//        }
//
//        if(p_start == p_end){
//            return new TreeNode(postorder[p_start]);
//        }
//
//        int i = 0;
//        while (i_start + i <=  i_end){
//            if(postorder[p_end] == inorder[i_start + i]){
//                TreeNode node = new TreeNode(postorder[p_end]);
//                node.left = method(inorder,postorder,i_start,i_start+i-1, p_start, p_start+i-1);
//                node.right = method(inorder,postorder,i_start+i+1, i_end, p_start+i,p_end-1);
//                return node;
//            }else {
//                i++;
//            }
//        }
//        return null;
//    }
}