package com.xuhu.LeetCode.other.lucong.T20201019;

/**
 * @author xuhu
 * @date 2020-10-19 20:39
 */
public class Main {

    public static void main(String[] args) {
        // 通过一个二叉树的完全形式数组 创建一个二叉树
        TreeNode node1 = TreeUtils.create(new Integer[]{1,2,3,4,5,6,7},0);
        TreeNode node2 = TreeUtils.create(new Integer[]{1,2,3,4,null,5,6,7,8,null,null,null,9},0);
        // 分别以图形形式打印二叉树
        TreeOperation.show(node1);
        System.out.println();
        TreeOperation.show(node2);
        // TreeUtils 中有前中后续遍历的模板方法，我这边就不改了

        System.out.println("\n前序打印node1");
        System.out.println("-------------");
        ListUtils.printList(TreeUtils.getTreeBeforeArray(node1));

        System.out.println("\n中序打印node1");
        System.out.println("-------------");
        ListUtils.printList(TreeUtils.getTreeMidArray(node1));

        System.out.println("\n后续打印node1");
        System.out.println("-------------");
        ListUtils.printList(TreeUtils.getTreeEndArray(node1));

        System.out.println("\n前序打印node2");
        System.out.println("-------------");
        ListUtils.printList(TreeUtils.getTreeBeforeArray(node2));

        System.out.println("\n中序打印node2");
        System.out.println("-------------");
        ListUtils.printList(TreeUtils.getTreeMidArray(node2));

        System.out.println("\n后续打印node2");
        System.out.println("-------------");
        ListUtils.printList(TreeUtils.getTreeEndArray(node2));
    }
}
