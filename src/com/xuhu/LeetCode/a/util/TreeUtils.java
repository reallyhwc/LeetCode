package com.xuhu.LeetCode.a.util;

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
}
