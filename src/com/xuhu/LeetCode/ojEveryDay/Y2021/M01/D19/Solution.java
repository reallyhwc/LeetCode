package com.xuhu.LeetCode.ojEveryDay.Y2021.M01.D19;


import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<Edge> queue = new PriorityQueue<>(Comparator.comparingInt(e -> e.len));
        int len = points.length;

        UnionFind unionFind = new UnionFind(len);
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                Edge edge = new Edge(points,i,j);
                queue.add(edge);
            }
        }
        int ans = 0;
        // 第一次会加入两个节点 所以这边默认size为1
        int size = 1;
        while (!queue.isEmpty()){
            Edge edge = queue.poll();
            if (unionFind.find(edge.x) != unionFind.find(edge.y)){
                unionFind.union(edge.x, edge.y);
                ans += edge.len;
                size++;
            }
            if (size == len){
                break;
            }
        }
        return ans;
    }
}

class Edge{
    int x;
    int y;
    int len;
    Edge(int[][] points, int i, int j){
        x = i;
        y = j;
        len = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
    }
}

class UnionFind{

    int[] parent;

    public UnionFind(int n) {
        this.parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    void union(int i, int j){
        parent[find(j)] = find(i);
    }

    int find(int num){
        if (parent[num] != num){
            parent[num] = find(parent[num]);
        }
        return parent[num];
    }
}