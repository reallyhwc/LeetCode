package com.xuhu.LeetCode.easy.easyBefore600.easy0589;

import com.xuhu.LeetCode.a.util.ListUtils;
import com.xuhu.LeetCode.a.util.Node;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();

        Node node5 = new Node(5,null);
        Node node6 = new Node(6,null);
        List<Node> list3 = new ArrayList<>();
        list3.add(node5);
        list3.add(node6);
        Node node3 = new Node(3,list3);
        Node node2 = new Node(2,null);
        Node node4 = new Node(4,null);
        List<Node> list1 = new ArrayList<>();
        list1.add(node3);
        list1.add(node2);
        list1.add(node4);
        Node node1 = new Node(1,list1);

        ListUtils.printList(solution.preorder(node1));
        System.out.println();
        ListUtils.printList(solution.preorder_diedai(node1));
    }
}