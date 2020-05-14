package com.xuhu.LeetCode.mid.midBefore200.mid0133;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * 说实话并没有太理解这个题目的意思，大意上是属于深拷贝并去重
     * 这边使用了一个比较省事儿的方法-新旧节点转换使用map
     */

    Map<Node,Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if(node == null) return null;
        if(map.containsKey(node)){
            return map.get(node);
        }

        Node newNode = new Node(node.val);
        map.put(node,newNode);
        for(Node item : node.neighbors){
            newNode.neighbors.add(cloneGraph(item));
        }
        return newNode;

    }
}