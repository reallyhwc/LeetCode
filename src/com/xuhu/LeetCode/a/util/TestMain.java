package com.xuhu.LeetCode.a.util;

/**
 * @author xuhu
 * @date 2020-04-28 8:50
 */
public class TestMain {
    public static void main(String[] args) {
        TreeNode node = TreeUtils.create(new Integer[]{1,2,3,4,5,6,7},0);
        ListUtils.printList(TreeUtils.getTreeBeforeArray(node));
        System.out.print("-----------------------------\n");
        ListUtils.printList(TreeUtils.getTreeMidArray(node));
        System.out.print("-----------------------------\n");
        ListUtils.printList(TreeUtils.getTreeEndArray(node));
    }
}
