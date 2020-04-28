package com.xuhu.LeetCode.a.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuhu
 * @date 2020-04-27 18:53
 */
public class TreeUtils {

    public static TreeNode create(Integer []array,int index)
    {
        TreeNode node = null;
        if (index<array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }
            node = new TreeNode(value);
            node.left = create(array, 2*index+1);
            node.right = create(array, 2*index+2);
            return node;
        }
        return node;
    }

    public static List getTreeBeforeArray(TreeNode node){
        List<Integer> list = new ArrayList<>();
        methodBefore(node,list);
        return list;
    }

    private static void methodBefore(TreeNode node, List<Integer> list){
        if(node == null) return;
        list.add(node.val);
        methodBefore(node.left,list);
        methodBefore(node.right,list);
    }

    public static List getTreeMidArray(TreeNode node){
        List<Integer> list = new ArrayList<>();
        methodMid(node,list);
        return list;
    }

    private static void methodMid(TreeNode node, List<Integer> list){
        if(node == null) return;
        methodMid(node.left,list);
        list.add(node.val);
        methodMid(node.right,list);
    }

    public static List getTreeEndArray(TreeNode node){
        List<Integer> list = new ArrayList<>();
        methodAfter(node,list);
        return list;
    }

    private static void methodAfter(TreeNode node, List<Integer> list){
        if(node == null) return;
        methodAfter(node.left,list);
        methodAfter(node.right,list);
        list.add(node.val);
    }
}
