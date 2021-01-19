package com.xuhu.LeetCode.ojEveryDay.Y2021.M01.D19;


import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {

    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<Edge> queue = new PriorityQueue<>(Comparator.comparingInt(e -> e.dis));
        int n = points.length;
        UnionFind unionFind = new UnionFind(n);

        int count = 1;
        for (int i = 0; i < n; i ++){
            for (int j = i + 1; j < n; j ++){
                Edge e = new Edge(points, i, j);
                queue.add(e);
            }
        }
        int res = 0;
        while (!queue.isEmpty()){
            Edge e = queue.poll();
            int x = e.x;
            int y = e.y;
            if (!unionFind.isUnion(x, y)){
                unionFind.union(x,y);
                res += e.dis;
                count ++;
            }
            if (count == n){
                break;
            }
        }
        return res;
    }
}
class Edge{
    int x;
    int y;
    int dis;
    Edge(int[][] points, int i, int j){
        x = i;
        y = j;
        dis = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
    }
}

class UnionFind{
    private int[] parent;

    UnionFind(int n) {
        this.parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    private int getParent(int i){
        if (i != parent[i]){
            parent[i] = getParent(parent[i]);
        }
        return parent[i];
    }

    boolean isUnion(int i, int j){
        return getParent(i) == getParent(j);
    }

    void union(int i, int j){
        parent[getParent(j)] = getParent(i);
    }
}