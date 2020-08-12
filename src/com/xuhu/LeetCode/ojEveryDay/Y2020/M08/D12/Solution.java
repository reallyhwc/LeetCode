package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D12;


import java.util.HashMap;
import java.util.Map;

class Solution {

    Map<Node,Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null){
            return null;
        }
        if (map.containsKey(node)){
            return map.get(node);
        }
        Node newNode = new Node(node.val);
        map.put(node, newNode);
        for (Node item : node.neighbors){
            newNode.neighbors.add(cloneGraph(item));
        }
        return newNode;

    }
}